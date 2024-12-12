package _06_class.example.thread;

public class Main4 implements Runnable {
    public static void main(String[] args) {
        Main4 obj = new Main4();
        Thread thread = new Thread(obj);
        thread.start();
        System.out.println("This code is outside of the thread");
    }

    public void run() {
        System.out.println("This code is running in a thread");
    }
}
