package _04_conditional_loop.quiz20241126;

import java.util.Scanner;

public class Quiz1 {
    public static void main(String[] args) {
        // if문이나 else if 문으로 작성
        // 사용자에게서 국어, 영어, 수학 점수를 각각 입력 받고,
        // 평균 점수 및 총점, 등급을 출력하는 프로그램을 작성하세요.
        // 등급은 95 이상 A+, 90이상 A, 85이상 B+, 80이상 B, 70이상 C, 60이상 D, 60미만 F로 처리
        // 출력 예시 > 당신의 총점은 xxx점 이고, xx.x점이고, 등급은 x입니다.

        Scanner sc = new Scanner(System.in);
        System.out.println("< 점수를 입력하세요 >");
        System.out.println("국어:");
        int kor = sc.nextInt();
        System.out.println("영어:");
        int eng = sc.nextInt();
        System.out.println("수학:");
        int math = sc.nextInt();
        int sum = kor + eng + math;
        double avg = (kor + eng + math) / 3.0;
        String grade = "";
        if (avg >= 95) {
            grade = "A+";
        } else if (avg >= 90) {
            grade = "A";
        } else if (avg >= 85) {
            grade = "B+";
        } else if (avg >= 80) {
            grade = "B";
        } else if (avg >= 75) {
            grade = "C+";
        } else if (avg >= 70) {
            grade = "C";
        } else if (avg >= 65) {
            grade = "D+";
        } else if (avg >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("당신의 총점은 " + sum + "점이고, 평균은 " + avg + "점이고, 등급은 " + grade + "입니다.");
        sc.close();
    }
}
