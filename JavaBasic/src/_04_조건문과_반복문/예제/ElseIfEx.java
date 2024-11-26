package _04_조건문과_반복문.예제;

import java.util.Scanner;

public class ElseIfEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("당신의 점수를 입력해주세요:");
        int score = sc.nextInt();
        // if ~ else if ~ else 문 : 한번의 조건문에 여러가지의 조건식을 사용하여 해당 조건에 맞는 값이 있을 경우 해당 코드 블럭을 실행하는 조건문
        // if ~ else if ~ else 문의 마지막에 있는 else문은 필수가 아님, 생략가능 ( 위의 조건식에서 나올 수 있는 모든 조건식을 다 입력시 가능 )
        // 위의 조건식에서 나올 수 있는 모든 조건식을 다 입력 가능
        if (score >= 90) {
            System.out.println("당신의 점수는 " + score + "점 이고, 등급은 A 입니다.");
        } else if (score >= 80) {
            System.out.println("당신의 점수는 " + score + "점 이고, 등급은 B 입니다.");
        } else if (score >= 70) {
            System.out.println("당신의 점수는 " + score + "점 이고, 등급은 C 입니다.");
        } else if (score >= 60) {
            System.out.println("당신의 점수는 " + score + "점 이고, 등급은 D 입니다.");
        } else {
            /*
             *  else if ( score < 60 ){ } 동일한 결과를 볼 수 있으며 System.out.println()을 출력하지 않을 때는 else문을 생략가능하다
             *
             * */
            System.out.println("당신의 점수는 " + score + "점 이고, 등급은 F 입니다.");

        }
        System.out.println("-------------------------------------------------------");
        // if ~else if ~ else문 사용시 조건식은 단계적으로 입력해야 합니다.
        if (score >= 90) {
            System.out.println("당신의 점수는 " + score + "점 이고, 등급은 A 입니다.");
        } else if (score >= 70) {
            System.out.println("당신의 점수는 " + score + "점 이고, 등급은 C 입니다.");
        } else if (score >= 80) {
            System.out.println("당신의 점수는 " + score + "점 이고, 등급은 B 입니다.");
        } else if (score >= 60) {
            System.out.println("당신의 점수는 " + score + "점 이고, 등급은 D 입니다.");
        } else {
            /*
             *  else if ( score < 60 ){ } 동일한 결과를 볼 수 있으며 System.out.println()을 출력하지 않을 때는 else문을 생략가능하다
             *
             * */
            System.out.println("당신의 점수는 " + score + "점 이고, 등급은 F 입니다.");

        }
    }
}
