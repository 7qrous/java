package _04_conditional_loop.answer20241126;

import java.util.Scanner;

public class Quiz8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----- 문제 8번 -----");
        for (int i = 1; i <= 50; i++) {
            if (!(i % 2 == 0)) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
