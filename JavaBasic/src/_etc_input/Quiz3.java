package _etc_input;

import java.util.Scanner;

public class Quiz3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("x의 값을 입력하세요 >>");
        int x = sc.nextInt(); // 키보드로 정수 입력 받기

        // y값을 얻기 위한 연산식, 기본 자바 연산자에 제곱연산자가 없음
        // 제곱 연산을 위해서 입력받은값을 곱해서 처리
        int y = x * x - 3 * x + 7;

        System.out.println("x=" + x + ", y=" + y);
        sc.close();
    }
}
