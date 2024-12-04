package _06_class.example.static_calculator_test1_20241204;

public class Calculator {
    static double pi = 3.14;

    static int plus(int x, int y) {
        return x + y;
    }

    static int minus(int x, int y) {
        return x - y;
    }
    void test(){
        System.out.println("pi = " + pi);
    }
}
