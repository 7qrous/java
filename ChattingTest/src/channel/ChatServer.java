package channel;

import java.io.*;
import java.net.*;
import java.util.*;

public class ChatServer {
    private static final int PORT = 12345;
    private static Map<String, Set<ClientHandler>> channels = new HashMap<>();

    public static void main(String[] args) {
        System.out.println("Chat server started...");
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            while (true) {
                Socket clientSocket = serverSocket.accept();
                new ClientHandler(clientSocket).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static class ClientHandler extends Thread {
        private Socket socket;
        private PrintWriter out;
        private BufferedReader in;
        private String username;
        private String currentChannel;

        public ClientHandler(Socket socket) {
            this.socket = socket;
        }

        public void run() {
            try {
                in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                out = new PrintWriter(socket.getOutputStream(), true);

                // 사용자 이름 설정
                out.println("Enter your username:");
                username = in.readLine();
                out.println("Welcome " + username + "! Use /join #channel to enter a chat channel.");

                String message;
                while ((message = in.readLine()) != null) {
                    if (message.startsWith("/")) {
                        handleCommand(message);
                    } else if (currentChannel != null) {
                        broadcast(currentChannel, username + ": " + message);
                    } else {
                        out.println("You are not in a channel. Use /join #channel to join.");
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                leaveChannel();
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        private void handleCommand(String command) {
            if (command.startsWith("/join ")) {
                String channel = command.substring(6).trim();
                if (!channel.startsWith("#")) {
                    out.println("Channel name must start with '#'.");
                    return;
                }
                joinChannel(channel);
            } else if (command.startsWith("/create ")) {
                String channel = command.substring(8).trim();
                if (!channel.startsWith("#")) {
                    out.println("Channel name must start with '#'.");
                    return;
                }
                createChannel(channel);
            } else if (command.startsWith("/leave")) {
                leaveChannel();
            } else {
                out.println("Unknown command. Available commands: /join, /create, /leave.");
            }
        }

        private void createChannel(String channel) {
            synchronized (channels) {
                if (channels.containsKey(channel)) {
                    out.println("Channel " + channel + " already exists.");
                } else {
                    channels.put(channel, new HashSet<>());
                    out.println("Channel " + channel + " created. Use /join " + channel + " to enter.");
                }
            }
        }

        private void joinChannel(String channel) {
            synchronized (channels) {
                if (!channels.containsKey(channel)) {
                    out.println("Channel " + channel + " does not exist. Use /create " + channel + " to create it.");
                    return;
                }
                leaveChannel(); // Leave the current channel first
                currentChannel = channel;
                channels.get(channel).add(this);
                broadcast(channel, username + " has joined the channel.");
                out.println("Joined channel " + channel + ".");
            }
        }

        private void leaveChannel() {
            if (currentChannel != null) {
                synchronized (channels) {
                    Set<ClientHandler> members = channels.get(currentChannel);
                    if (members != null) {
                        members.remove(this);
                        if (members.isEmpty()) {
                            channels.remove(currentChannel);
                        } else {
                            broadcast(currentChannel, username + " has left the channel.");
                        }
                    }
                }
                currentChannel = null;
                out.println("You left the channel.");
            }
        }

        private void broadcast(String channel, String message) {
            synchronized (channels) {
                Set<ClientHandler> members = channels.get(channel);
                if (members != null) {
                    for (ClientHandler member : members) {
                        member.out.println(message);
                    }
                }
            }
        }
    }
}
