package _04_조건문과_반복문.퀴즈풀이;

import java.util.Scanner;

public class Quiz6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("출력할 구구단의 단수를 입력하세요 >> ");
        int dan = sc.nextInt();
        System.out.println("--문제 6 (" + dan + "단) ----");
        for (int i = 1; i < 10; i++) {
            int result = dan * i;
            System.out.println(dan + " * " + i + " = " + result);
        }
        sc.close();

    }
}
