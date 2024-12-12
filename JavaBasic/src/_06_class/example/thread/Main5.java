package _06_class.example.thread;

public class Main5 extends Thread {
    public static int amount = 0;

    public static void main(String[] args) {
        Main5 thread = new Main5();
        thread.start();
        System.out.println(amount);
        amount++;
        System.out.println(amount);
    }

    public void run() {
        amount++;
    }
}
