package _05_reference_type.answer20241127;

import java.util.Scanner;

public class Quiz6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("배열의 크기를 입력( n<=5 ):");
        int n = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print(i + "번 index 입력 ( 1<= n <= 100 ) >");
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        sc.close();
    }
}
