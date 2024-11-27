package _04_조건문과_반복문.퀴즈20241126;

import java.util.Scanner;

public class Quiz5 {
    public static void main(String[] args) {
        // 87.p 5번문제
        Scanner sc = new Scanner(System.in);
        System.out.print("논리 연산을 입력하세요 >> ");
        boolean a = sc.nextBoolean();
        String op = sc.next();
        boolean b = sc.nextBoolean();
        
        switch (op.toLowerCase()) {
            case ("and"):
                System.out.println(a && b);
                break;
            case ("or"):
                System.out.println(a || b);
                break;
            default:
                System.out.println("올바르지 않은 입력값 입니다.");

        }
        sc.close();
    }
}
