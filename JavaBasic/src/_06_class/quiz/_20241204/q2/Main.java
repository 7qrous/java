package _06_class.quiz._20241204.q2;

import java.util.Scanner;

/*
*     문제 2) 사용자 입력을 통해서 지정한 구구단을 출력하는 프로그램을 작성하세요.
            # 구구단 출력 부분과 사용자 데이터 입력 부분을 서로 다른 메소드로 만들어서 실행
* */
public class Main {
    public static void main(String[] args) {
        Gugudan gugudan = new Gugudan();
        int dan = gugudan.in();
        gugudan.out(dan);
    }
}
