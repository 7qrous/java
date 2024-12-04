package _06_class.quiz._20241204.q3;

import java.util.Scanner;

public class Program {
    Scanner sc;
    int kor;
    int eng;
    int math;
    int sum;
    double avg;
    char grade;

    public Program() {
        sc = new Scanner(System.in);
    }

    public void in() {
        Scanner sc = new Scanner(System.in);
        System.out.print("국어 점수를 입력해주세요: ");
        kor = sc.nextInt();
        System.out.print("영어 점수를 입력해주세요: ");
        eng = sc.nextInt();
        System.out.print("수학 점수를 입력해주세요: ");
        math = sc.nextInt();
        sc.close();
    }


    public void calculateGrade() {
        if (avg >= 90) {
            grade = 'A';
        } else if (avg >= 80) {
            grade = 'B';
        } else if (avg >= 70) {
            grade = 'C';
        } else if (avg >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
    }

    public void out() {
        //결과 출력
        System.out.println("국어점수는 " + kor + "점이고");
        System.out.println("영어점수는 " + eng + "점이고");
        System.out.println("수학점수는 " + math + "점이고");
        System.out.println("당신의 총점은 " + sum + "점이고,");
        System.out.println("평균은 " + avg + "점이며, ");
        System.out.println("등급은 " + grade + "입니다.");
    }

    public void calculateSum() {
        sum = eng + math + kor; // 총점
    }

    public void calculateAvg() {
        avg = (double) sum / 3; // 평균
    }
}
