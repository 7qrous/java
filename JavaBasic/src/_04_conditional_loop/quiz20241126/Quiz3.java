package _04_conditional_loop.quiz20241126;

import java.util.Scanner;

//88.p 6번 문제
public class Quiz3 {
    // 돈의 액수를 입력받아 오만원권, 만원권, 천원권, 500원, 100원, 10원, 1원으로 각 몇 개 변환 되는지 출력하라.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("돈의 액수를 입력하세요>>");
        int money = sc.nextInt();
        int w50000 = money / 50000;
        money = money % 50000;

        int w10000 = money / 10000;
        money = money % 10000;

        int w1000 = money / 1000;
        money = money % 1000;

        int w500 = money / 500;
        money = money % 500;
        int w100 = money / 100;
        money = money % 100;
        int w10 = money / 10;
        money = money % 10;
        int w1 = money;
        System.out.print("오만원" + w50000 + "개, ");
        System.out.print("만원" + w10000 + "개, ");
        System.out.print("천원" + w1000 + "개, ");
        System.out.print("오백원" + w500 + "개, ");
        System.out.print("100원" + w100 + "개, ");
        System.out.print("10원" + w10 + "개, ");
        System.out.println("1원" + w1 + "개");
        sc.close();
    }
}
