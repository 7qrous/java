package _06_class.quiz._20241204.q2;

import java.util.Scanner;

public class Gugudan {
    Scanner sc;

    public Gugudan() {
        sc = new Scanner(System.in);
    }

    int in() {
        System.out.print("출력할 구구단의 단수를 입력해주세요>>");
        int dan = sc.nextInt();
        sc.close();
        System.out.println("입력받은 숫자 >>" + dan);
        return dan;
    }

    // 출력 부분
    void out(int dan) {
        for (int i = 1; i < 10; i++) {
            System.out.println((dan) + "*" + (i) + "=" + dan * i);
        }
    }
}
