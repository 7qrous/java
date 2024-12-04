package _06_class.quiz._20241204.q1;

//    문제 1) Calculator3 클래스에 사칙 연산을 위한 메소드를 선언하고 그 메소드를 사용하여 사칙 연산의 결과를 출력하는 프로그램을 작성하세요.
//    # 메소드명 : sum - 덧셈, sub - 뺄셈, multi - 곱셈, div - 나눗셈
//    # sum은 2번 형태, sub는 3번 형태, multi는 4번 형태, div 1번 형태

public class Main {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println("--1. sum:2번형태--");
        c.sum(1, 2);
        System.out.println("--2. sub:3번형태--");
        int r2 = c.sub();
        System.out.println("x-y:" + r2);
        System.out.println("--3. multi:4번형태--");
        int r3 = c.multi(1, 2);
        System.out.println("x*y:" + r3);
        System.out.println("--4. div:1번형태--");
        c.div();
    }
}
