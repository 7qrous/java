package _04_conditional_loop.quiz20241126;

import java.util.Scanner;

// while문을 사용하여 사용자가 입력한 단수의 구구단을 출력
public class Quiz7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N단을 입력하세요:");
        int dan = sc.nextInt();
        int i = 1;
        while (i < 10) {
            System.out.println(dan + " * " + i + " = " + dan * i);
            i++;
        }
        sc.close();
    }
}