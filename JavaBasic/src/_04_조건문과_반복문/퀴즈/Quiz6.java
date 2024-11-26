package _04_조건문과_반복문.퀴즈;

import java.util.Scanner;

//for문을 사용하여 사용자가 입력한 단수의 구구단을 출력
public class Quiz6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N 단을 입력하세요:");
        int dan = sc.nextInt();
        for (int i = 1; i < 10; i++) {
            System.out.println(dan + "*" + i + "=" + dan * i);
        }
        sc.close();
    }
}
