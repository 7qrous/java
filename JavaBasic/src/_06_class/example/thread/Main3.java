package _06_class.example.thread;

public class Main3 extends Thread {
    public static void main(String[] args) {
        Main3 thread = new Main3();
        thread.start();
        System.out.println("This code is outside of the thread");
    }

    public void run() {
        System.out.println("This code is running in a thread");
    }
}
