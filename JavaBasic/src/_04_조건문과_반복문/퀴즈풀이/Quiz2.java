package _04_조건문과_반복문.퀴즈풀이;

import java.util.Scanner;

// 87.p 4번문제
// 2차원 평면에서 하나의 직사각형은 두점으로 표현된다. ( 50, 50) 과 ( 100, 100)의 두 점으로 이루어진 사각형이 있다고하자.
// 한 점을 구성하는 정수 x와 y값을 입력받고 점 (x,y)가 이 사각형 안에 있는지 판별하는 프로그램을 작성하라.
public class Quiz2 {
    public static void main(String[] args) {
        // 키보드 입력용
        Scanner sc = new Scanner(System.in);
        // 입력된 데이터 저장용 변수
        int x = 0;
        int y = 0;
        String result = "";
        System.out.println("점 (x, y)의 좌표를 입력하세요 >> ");

        x = sc.nextInt();
        y = sc.nextInt();

        // 사용자가 입력한 x,y가 지정한 사각형 안에 있는지 아닌지의 결과를 저장하는 변수
        boolean resultX = false;
        boolean resultY = false;

        // x가 50보다 크거나 같고, 100보다 작거나 같은지 확인
        if (x >= 50) {
            if (x <= 100) {
                resultX = true;
            }
        }
        if (y >= 50) {
            if (y <= 100) {
                resultY = true;
            }
        }
        if (resultX && resultY) {
            result = "내";
        } else {
            result = "밖";
        }
        System.out.printf("점 (%d, %d)은 (50,50)과 (100, 100)의 사각형 %s에 있습니다.", x, y, result);
        sc.close();
    }
}
