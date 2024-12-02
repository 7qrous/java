package _04_conditional_loop_exception.quiz20241126;

import java.util.Scanner;

//88.p 9번문제
public class Quiz4 {
    // 369게임의 일부를 작성해보자. 1~99까지의 정수를 입력받고 수에 3,6,9 중 하나가 있는 경우 "박수짝", 두개있는경우 "박수짝짝", 하나도 없으면 "박수 없음" 을
    // 출력하는 프로그램을 작성하라. 예를 들면 13인 경우 "박수짝", "36인경우 박수짝짝", 5인경우 박수없음을 출력하면된다.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1~99 사이의 정수를 입력하세요>>");
        int num = sc.nextInt();

        int first = num / 10;
        int second = num % 10;


        if ( !(first == 3 || first == 6 || first == 9 || second == 3 || second == 6 || second == 9) ) {
            System.out.println("박수 없음");
        } else {
            System.out.println("박수");
            if (first == 3 || first == 6 || first == 9) {
                System.out.println("짝");
            }
            if (second == 3 || second == 6 || second == 9) {
                System.out.println("짝");

            }
        }


        sc.close();
    }
}














