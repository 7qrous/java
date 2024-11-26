package _04_조건문과_반복문.퀴즈풀이;

import java.util.Scanner;

public class Quiz5 {
    public static void main(String[] args) {
        // 논리 타입 데이터를 입력받아 변수에 저장
        Scanner sc = new Scanner(System.in);
        // 문자열 타입의 데이터를 입력받아 변수에 저장
        System.out.print("논리 연산을 입력하세요 >> ");
        boolean a = sc.nextBoolean();
        String op = sc.next();
        boolean b = sc.nextBoolean();

        // 최정 결과를 저장할 변수
        boolean result = false;
        // switch ~ case문으로 AND 연산인지 OR 연산인지 확인
        switch (op) {
            case "AND":
                result = a && b;
                break;
            case "OR":
                result = a || b;
                break;
            default:
                System.out.println("잘못된 입력입니다.");
        }
        System.out.println(result);
        sc.close();
    }
}
