package _04_conditional_loop_exception.answer20241202;

import java.util.Scanner;

//126.p -2
public class Quiz1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numArr[] = new int[10];
        System.out.print("정수 10개 입력 >>");
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = sc.nextInt();
        }
        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] % 3 == 0) {
                System.out.println(numArr[i]);
            }
        }
        sc.close();
    }
}
