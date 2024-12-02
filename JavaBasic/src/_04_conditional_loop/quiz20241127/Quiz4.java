package _04_conditional_loop.quiz20241127;

import java.util.Scanner;

// 4 : 사용자 입력을 통해서 2~9까지의 정수 중 하나를 입력받고, 입력받은 숫자에 해당하는 구구단 단수 전까지 모든 구구단을 출력하는 프로그램을 작성하세요
public class Quiz4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("2~9까지의 숫자를 입력해주세요>");
        int input = sc.nextInt();
        for (int i = 1; i <= 9; i++) {
            for (int j = 2; j <= 9; j++) {
                System.out.printf("%d*%d=%2d ", j, i, (i * j));
                if (j == input) {
                    break;
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
