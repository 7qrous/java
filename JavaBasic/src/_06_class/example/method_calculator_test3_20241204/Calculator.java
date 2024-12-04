package _06_class.example.method_calculator_test3_20241204;

public class Calculator {

    void powerOn() {
        System.out.println("Power on");
    }

    void powerOff() {
        System.out.println("Power off");
    }

    double divide(int x, int y) {
        double result = (double) x / y;
        return result;
    }

    int plus(int x, int y) {
        int result = x + y;
        return result;
    }

    int minus(int x, int y) {
        int result = x - y;
        return result;
    }

    int multi(int x, int y) {
        int result = x * y;
        return result;
    }

}
