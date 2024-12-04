package _06_class.example.method_test2_20241204;

public class Calculator {
    void plus1() {
        int x = 10;
        int y = 3;
        int result = x + y;
        System.out.println("x+y:" + result);
    }

    void plus2(int x, int y) {
        int result = x + y;
        System.out.println("x+y:" + result);
    }

    int plus3() {
        int x = 10;
        int y = 3;
        int result = x + y;
        return result;
    }

    int plus4(int x, int y) {
        int result = x + y;
        return result;
    }
}
