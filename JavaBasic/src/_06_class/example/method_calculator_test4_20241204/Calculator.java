package _06_class.example.method_calculator_test4_20241204;

public class Calculator {
    int plus(int a, int b) {
        return a + b;
    }

    double avg(int a, int b) {
        double sum = a + b;
        return (a + b) / 2.0;
    }

    void execute() {
        double result = avg(7, 10);
        output("실행결과:" + result);
    }

    void output(String message) {
        System.out.println(message);
    }
}
