package _04_conditional_loop.quiz20241202;

import java.util.Scanner;

public class Quiz6 {
    public static void main(String[] args) {
        // 키보드 입력을 통해 1~9까지의 숫자를 입력받고, 주어진 배열에 입력받은 숫자가 총 몇개가 존재하는지 출력하세요.
        int numberArr[] = {3, 7, 5, 1, 8, 4, 9, 2, 6, 5, 7, 1, 3, 8, 9, 2, 4, 6, 5, 7};
        int numberCount[] = new int[9];
        Scanner sc = new Scanner(System.in);
        System.out.print(">");
        int inputNumber = sc.nextInt();
        for (int i = 0; i < numberArr.length; i++) {
            numberCount[numberArr[i] - 1]++;
        }
        System.out.println(numberCount[inputNumber - 1]);
        sc.close();
    }
}
