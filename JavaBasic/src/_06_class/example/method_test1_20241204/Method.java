package _06_class.example.method_test1_20241204;

import java.util.Scanner;

public class Method {
    static Scanner sc = new Scanner(System.in);

    static void scoreCalculator() {
        System.out.print("당신의 국어 점수를 입력하세요>>");
        int kor = sc.nextInt();
        System.out.print("당신의 영어 점수를 입력하세요>>");
        int eng = sc.nextInt();
        System.out.print("당신의 수학 점수를 입력하세요>>");
        int math = sc.nextInt();

        int total = 0;
        int avg = 0;
        String grade = "F";
        total = kor + eng + math;
        avg = total / 3;
        if (avg >= 90) {
            grade = "A";
        } else if (avg >= 80) {
            grade = "B";
        } else if (avg >= 70) {
            grade = "C";
        } else if (avg >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println("당신의 총점은 " + total + " 점이고, 평균은 " + avg + "점이며, 등급은 " + grade + "입니다.");
        System.out.println("\n-------");
    }

    static void gugudan() {
        System.out.print("출력할 구구단의 단수를 입력해주세요>>");
        int dan = sc.nextInt();
        for (int i = 0; i < 10; i++) {
            System.out.println((dan) + "*" + (i) + "=" + dan * i);
        }
    }

    public static void main(String[] args) {
//      scoreCalculator(); //총점, 평균, 등급 계산
        gugudan(); // 구구단
        sc.close();
    }
}
