package _06_class.quiz._20241204.q1;

public class Calculator {
    void sum(int x, int y) {
        System.out.println("x+y:" + x + y);
    }

    int sub() {
        int x = 1;
        int y = 2;
        int result = x - y;
        return result;
    }

    int multi(int x, int y) {
        int result = x * y;
        return result;
    }

    void div() {
        int x = 1;
        int y = 2;
        System.out.println("x/y:" + ((double) x / y));
    }

}
