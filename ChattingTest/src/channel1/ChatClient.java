package channel1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

public class ChatClient {
    private static final String SERVER_ADDRESS = "localhost";
    private static final int SERVER_PORT = 12345;
    private Socket socket;
    private PrintWriter out;
    private BufferedReader in;

    private JFrame frame = new JFrame("IRC Chat Client");
    private JTextArea messageArea = new JTextArea(20, 40);
    private JTextField inputField = new JTextField(40);
    private String username;
    private String currentChannel;  // 현재 채널명 저장

    public ChatClient() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        messageArea.setEditable(false);
        frame.add(new JScrollPane(messageArea), BorderLayout.CENTER);
        frame.add(inputField, BorderLayout.SOUTH);

        inputField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sendMessage(inputField.getText());
                inputField.setText("");
            }
        });

        frame.pack();
        frame.setVisible(true);
    }

    private void start() {
        try {
            socket = new Socket(SERVER_ADDRESS, SERVER_PORT);
            out = new PrintWriter(socket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            username = JOptionPane.showInputDialog(frame, "Enter your username:", "Username", JOptionPane.PLAIN_MESSAGE);
            if (username == null || username.trim().isEmpty()) {
                username = "Anonymous";
            }
            out.println(username);

            new Thread(new IncomingReader()).start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void sendMessage(String message) {
        if (out != null && !message.trim().isEmpty()) {
            out.println(message);
        }
    }

    // 채널 변경 시 창 제목 업데이트
    private void updateWindowTitle(String channel) {
        currentChannel = channel;
        if (channel == null || channel.isEmpty()) {
            frame.setTitle("IRC Chat Client");
        } else {
            frame.setTitle("IRC Chat Client - " + channel);
        }
    }

    private class IncomingReader implements Runnable {
        public void run() {
            try {
                String message;
                while ((message = in.readLine()) != null) {
                    messageArea.append(message + "\n");

                    // 채널 입장/퇴장 메시지를 처리하여 창 제목을 업데이트
                    if (message.startsWith("Joined channel") || message.startsWith("You left the channel")) {
                        String channel = extractChannelFromMessage(message);
                        updateWindowTitle(channel);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // 채널 이름을 메시지에서 추출
        private String extractChannelFromMessage(String message) {
            if (message.startsWith("Joined channel")) {
                return message.substring(message.indexOf(" ") + 1).trim();
            }
            return ""; // 채널 정보가 없으면 빈 문자열 반환
        }
    }

    public static void main(String[] args) {
        ChatClient client = new ChatClient();
        client.start();
    }
}

