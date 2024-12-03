package _06_class.example.method_calculator_test1;

public class Calculator {
    public void powerOff() {
        System.out.println("Power off");
    }

    public void powerOn() {
        System.out.println("Power on");
    }

    public int plus(int x, int y) {
        int result = x + y;
        return result;
    }

    public double divide(int x, int y) {
        double result = (double) x / (double) y;
        return result;
    }
}
