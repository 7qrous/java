package _04_conditional_loop.answer20241126;

import java.util.Scanner;

//88.p 6번 문제
public class Quiz3 {
    // 돈의 액수를 입력받아 오만원권, 만원권, 천원권, 500원, 100원, 10원, 1원으로 각 몇 개 변환 되는지 출력하라.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money = 0;
        System.out.print("돈의 액수를 입력하세요 >> ");
        money = sc.nextInt();

        int money50000 = money / 50000;
        money = money % 50000; // money %= 50000;
        int money10000 = money / 10000;
        money = money % 10000;
        int money1000 = money / 1000;
        money = money % 1000;
        int money500 = money / 500;
        money = money % 500;
        int money100 = money / 100;
        money = money % 100;
        int money10 = money / 10;
        money = money % 10;
        int money1 = money;
//      System.out.printf("50000원 %d개, 1000원 %d개, 1000원 %d개, 500원 %d개, 100원 %d개, 10원 %d개, 1원 %d개", money50000, money10000, money1000, money500, money100, money10, money1);
        String result = "50000원:" + money50000 + "개,";
        result += "10000원:" + money10000 + "개,";
        result += "1000원:" + money1000 + "개,";
        result += "500원:" + money500 + "개,";
        result += "100원:" + money100 + "개,";
        result += "10원:" + money10 + "개,";
        result += "1원:" + money1 + "개";
        System.out.println(result);
        sc.close();
    }
}
