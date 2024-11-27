package _05_참조타입.퀴즈20241127;

import java.util.Scanner;

/*
 *  문제 8) 사용자에게서 영어(소문자) 를 입력받고 주어진 char 타입 배열 안에 입력된 알파벳 중 사용자가 입력한 알파벳은 몇개가 있는지 확인하는 프로그램을 작성하세요

 */
public class Quiz8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char eng[] = {'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd', ',', ' ', 'h', 'e', 'l', 'l', 'o', ' ', 'u', 'n', 'i', 'v', 'e', 'r', 's', 'e'};
        int count = 0;

        int engCount[] = new int[26];
        for (int i = 0; i < engCount.length; i++) {
            engCount[i] = 0;
        }
        for (int i = 0; i < eng.length; i++) {
            if ('a' <= eng[i] && eng[i] <= 'z') {
                engCount[eng[i] - 'a']++;
            }
        }
        char inputCharacter = sc.next().charAt(0);
        System.out.println(engCount[(inputCharacter - 'a')]);

    }
}
