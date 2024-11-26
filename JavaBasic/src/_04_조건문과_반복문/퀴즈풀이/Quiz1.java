package _04_조건문과_반복문.퀴즈풀이;


import java.util.Scanner;

public class Quiz1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 국어, 영어, 수학, 총점 평균 점수를 저장하기 위한 변수 선언
        int kor = 0;
        int eng = 0;
        int math = 0;
        int total = 0;
        int avg = 0;
        String grade = "F";

        System.out.print("국어 점수를 입력해주세요 >> ");
        kor = sc.nextInt();
        System.out.print("영어 점수를 입력해주세요 >> ");
        eng = sc.nextInt();
        System.out.print("수학 점수를 입력해주세요 >> ");
        math = sc.nextInt();

        total = kor + eng + math;
        avg = total / 3;
        System.out.println();

        if (avg >= 95) {
            grade = "A+";
        } else if (avg >= 90) {
            grade = "A";
        } else if (avg >= 85) {
            grade = "B+";
        } else if (avg >= 80) {
            grade = "B";
        } else if (avg >= 70) {
            grade = "C";
        } else if (avg >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println("당신의 총점은 " + total + "점이고, 평균은 " + avg + "점이고, 등급은 " + grade + "입니다.");


        // 중첩 if ~ else 사용 시
        if (avg >= 90) {
            if (avg >= 95) {
                grade = "A+";
            } else {
                grade = "A";
            }
        } else {
            if (avg >= 80) {
                if (avg >= 85) {
                    grade = "B+";
                } else {
                    grade = "B";
                }
            } else {
                if (avg >= 70) {
                    grade = "C";
                } else {
                    if (avg >= 60) {
                        grade = "D";
                    } else {
                        grade = "F";
                    }
                }
            }
        }

        //if ~ else if 문과 중첩 if 문을 함께 사용 시
        if (avg >= 90) {
            if (avg >= 95) {
                grade = "A+";
            } else {
                grade = "A";
            }
        } else if (avg >= 80) {
            if (avg >= 85) {
                grade = "B+";
            } else {
                grade = "B";
            }
        }
        // ...

        sc.close();
    }
}
