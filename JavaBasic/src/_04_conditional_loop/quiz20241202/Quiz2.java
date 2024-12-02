package _04_conditional_loop.quiz20241202;

import java.util.Scanner;

public class Quiz2 {
    public static void main(String[] args) {
        char day[] = {'일', '월', '화', '수', '목', '금', '토'};
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요>>");
        int num = sc.nextInt();
        System.out.println(day[num % 7]);
        sc.close();
    }
}
