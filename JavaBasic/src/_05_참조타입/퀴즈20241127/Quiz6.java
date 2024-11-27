package _05_참조타입.퀴즈20241127;

import java.util.Scanner;

// 사용자 입력을 통해서 배열의 크기를 지정하고, 지정된 배열의 크기만큼 1~100까지의 숫자를 입력받아 저장 후 배열의 모든 내용을 출력하는 프로그램을 작성하세요.
public class Quiz6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("배열의 크기를 입력( n<=5 ):");
        int n = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print(i + "번 index 저장된 내용>");
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        sc.close();
    }
}
