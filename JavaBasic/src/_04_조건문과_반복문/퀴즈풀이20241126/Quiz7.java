package _04_조건문과_반복문.퀴즈풀이20241126;

import java.util.Scanner;

public class Quiz7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("출력할 구구단의 단수를 입력해주세요 >> ");
        int dan = sc.nextInt();
        int count = 1;
        System.out.println("----- 문제 7 (" + dan + "단) -----");
        while (count < 10) {
            System.out.println(dan + " * " + count + " = " + dan * count);
            count++;
        }
        sc.close();
    }
}
