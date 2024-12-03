package _04_conditional_loop.answer20241202;

import java.util.Scanner;

public class Quiz3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        -6 -3 1 3 5 9 17 23 77 234
        int numSort[] = new int[10];
        System.out.print("\n정수를 10개 입력해주세요");
//       입력
        for (int i = 0; i < numSort.length; i++) {
            System.out.print((i + 1) + "번째 입력>>");
            numSort[i] = sc.nextInt();
        }
        System.out.println();


        for (int i = 0; i < numSort.length; i++) {
            for (int j = i; j < numSort.length; j++) {
                if (numSort[i] > numSort[j]) {
                    int tmp = numSort[i];
                    numSort[i] = numSort[j];
                    numSort[j] = tmp;
                }

            }
        }
//        출력
        for (int num : numSort) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}
