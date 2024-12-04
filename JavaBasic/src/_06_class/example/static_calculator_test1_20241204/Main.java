package _06_class.example.static_calculator_test1_20241204;

public class Main {
    public static void main(String[] args) {
        // new 키워드를 사용하지 않고 값을 static method를 통해 계산했음
        // Calculator5의 정적 메소드를 호출하여 사용
        // 정적 메소드는 객체 생성 없이 클래스 명을 통해 바로 사용
        double result1 = Calculator.pi * 10 * 10;
        int result2 = Calculator.plus(10, 20);
        int result3 = Calculator.minus(10, 20);
        System.out.println("result1: " + result1);
        System.out.println("result2: " + result2);
        System.out.println("result3: " + result3);
    }
}
