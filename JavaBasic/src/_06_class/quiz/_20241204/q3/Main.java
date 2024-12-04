package _06_class.quiz._20241204.q3;

import java.util.Scanner;

//    문제 3) 사용자 입력을 통해서 국어, 영어, 수학 3과목의 점수를 각각 입력받고, 총점과 평균, 등급을 출력하는 프로그램을 작성하세요
//    # 데이터 입력 메소드, 총점 계산 메소드, 평균 계산 메소드, 등급 계산 메소드, 결과 출력 메소드로 각각 분리하여 작성하세요
public class Main {
    static int kor;
    static int eng;
    static int math;
    static int total;
    static double avg;
    static char grade;

    public static void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter KOR score: ");
        kor = sc.nextInt();
        System.out.print("Enter ENG score: ");
        eng = sc.nextInt();
        System.out.print("Enter MATH score: ");
        math = sc.nextInt();
        sc.close();
    }

    public static void run() {
        input();
        sum();
        avg();
        check();
        output();
    }

    public static void check() {
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

    public static void output() {
        System.out.println("국어:"+kor);
        System.out.println("영어:"+eng);
        System.out.println("수학:"+math);
        System.out.println("총점:"+total);
        System.out.println("평균:"+avg);
        System.out.println("학점:"+grade);
    }

    public static void sum() {
        total = eng + math + kor;
    }

    public static void avg() {
        avg = (double) total / 3;
    }

    public static void main(String[] args) {
        run();
    }
}
