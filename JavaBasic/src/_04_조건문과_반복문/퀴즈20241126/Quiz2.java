package _04_조건문과_반복문.퀴즈20241126;

import java.util.Scanner;

// 87.p 4번문제
public class Quiz2 {
    // 2차원 평면에서 하나의 직사각형은 두점으로 표현된다. ( 50, 50) 과 ( 100, 100)의 두 점으로 이루어진 사각형이 있다고하자.
    // 한 점을 구성하는 정수 x와 y값을 입력받고 점 (x,y)가 이 사각형 안에 있는지 판별하는 프로그램을 작성하라.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("점 (x,y)의 좌표를 입력하세요>>");
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.print("점(" + x + "," + y + ")은 ( 50, 50) 과 ( 100, 100)의 사각형 ");
        if ((x >= 50 && x <= 100) &&(y >= 50 && y <= 100)) {
            System.out.print("내에 있습니다.");
        } else {
            System.out.print("밖에 있습니다.");
        }
        sc.close();
    }
}


