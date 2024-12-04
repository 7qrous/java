package _06_class.quiz._20241204.q3;

import java.util.Scanner;

//    문제 3) 사용자 입력을 통해서 국어, 영어, 수학 3과목의 점수를 각각 입력받고, 총점과 평균, 등급을 출력하는 프로그램을 작성하세요
//    # 데이터 입력 메소드, 총점 계산 메소드, 평균 계산 메소드, 등급 계산 메소드, 결과 출력 메소드로 각각 분리하여 작성하세요
public class Main {


    public static void main(String[] args) {
        Program p = new Program();
        p.in();
        p.calculateSum();
        p.calculateAvg();
        p.calculateGrade();
        p.out();
    }
}
