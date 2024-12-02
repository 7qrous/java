package _04_conditional_loop.answer20241202;

import java.util.Scanner;

public class Quiz2 {
    public static void main(String[] args) {
        //126.p - 4
        // char type array 생성 (일월화수목금토)
        // 키보드로 숫자 입력받기, 7로 나머지 연산, 나머지가 index
        // 음수 입력 시 프로그램 종료
        // 음수 입력시 프로그램종료, while로 무한반복, if문으로 0보다 작은지 확인하기
        Scanner sc = new Scanner(System.in);
        char day[] = new char[]{'일', '월', '화', '수', '목', '금', '토'};
        while (true) {
            System.out.print("정수를 입력하세요>>");
            int inputNum = sc.nextInt();
            if (inputNum >= 0) {
                int index = inputNum % 7;
                System.out.println(day[index]);
            } else {
                break;
            }
        }
        sc.close();

    }
}
