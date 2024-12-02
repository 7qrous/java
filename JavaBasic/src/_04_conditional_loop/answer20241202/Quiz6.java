package _04_conditional_loop.answer20241202;

import java.util.Scanner;

public class Quiz6 {
    public static void main(String[] args) {
        int numberArr[] = {3, 7, 5, 1, 8, 4, 9, 2, 6, 5, 7, 1, 3, 8, 9, 2, 4, 6, 5, 7};
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("1~9 까지의 정수를 입력하세요 >> ");
        int num = sc.nextInt();
        for (int i = 0; i < numberArr.length; i++) {
            if (numberArr[i] == num) {
                count++;
            }
        }
        System.out.println("배열안에서 사용자가 입력한 숫자와 일치하는 숫자의 개수는 " + count);
        sc.close();
    }
}
