package _06_class.example.method_test2_20241204;

public class Main {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println("-1번형태-");
        cal.plus1();
        System.out.println("-2번형태-");
        cal.plus2(10, 3);
        cal.plus2(10, 20);
        System.out.println("-3번형태-");
        int result3 = cal.plus3();
        System.out.println("두 수의 덧셈은 " + result3 + "입니다.");
        result3 = result3 + 10;
        System.out.println("반환 받은 데이터를 추가 연산 후 결과:" + result3);
        System.out.println("-4번형태-");
        int result4 = cal.plus4(10, 3);
        System.out.println("두 수의 덧셈은 " + result4 + "입니다.");
        result4 = cal.plus4(10, 20);
        System.out.println("두 수의 덧셈은 " + result4 + "입니다.");
        result4 = result4 * 2;
        System.out.println("반환 받은 데이터를 추가 연산 후 결과:" + result4);
    }
}
