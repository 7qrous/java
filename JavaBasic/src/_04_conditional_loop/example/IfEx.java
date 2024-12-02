package _04_conditional_loop.example;

import java.util.Scanner;

public class IfEx {
    public static void main(String[] args) {
        System.out.print("점수를 입력하세요:");
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        if (score >= 90) { // true <-- 95>=90

            System.out.println("점수가 90이상입니다.");
            System.out.println("등급은 A입니다.");
        }
        if (score < 90) {
            System.out.println("점수가 90보다 작습니다.");
            System.out.println("등급은 A입니다.");
        }

        System.out.print("당신의 소지금액을 알려주세요 >> ");
        int money = sc.nextInt();
        System.out.println("점심 먹으로 중화요리점에 갑니다.");
        System.out.println("자장면을 주문합니다.");

        if (money > 12000) {
            System.out.println("군만두를 추가로 주문합니다.");
        }

        System.out.println("음식을 맛있게 먹습니다.");

    }
}


