package _04_조건문과_반복문.예제;

import java.util.Scanner;

public class SwitchNoBreakEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1 ~ 10까지의 숫자를 입력해주세요 >> ");
        int num = sc.nextInt();
        switch (num) {
            case 1:
                System.out.println("입력 숫자 1");
                break;
            case 2:
                System.out.println("입력 숫자 2");
//                break;
            case 3:
                System.out.println("입력 숫자 3");
//                break;
            case 4:
                System.out.println("입력 숫자 4");
                break;
            case 5:
                System.out.println("입력 숫자 5");
                break;
            // 의도적으로  break를 생략
            case 6:
            case 7:
            case 8:
                System.out.println("입력 숫자 6, 7, 8");
                break;
            case 9:
                System.out.println("입력 숫자 9");
                break;
            case 10:
                System.out.println("입력 숫자 10");
                break;
        }
        sc.close();
    }
}
