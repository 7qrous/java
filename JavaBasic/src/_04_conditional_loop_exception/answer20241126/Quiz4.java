package _04_conditional_loop_exception.answer20241126;

import java.util.Scanner;

//88.p 9번문제
public class Quiz4 {
    public static void main(String[] args) {
        // 369게임의 일부를 작성해보자. 1~99까지의 정수를 입력받고 수에 3,6,9 중 하나가 있는 경우 "박수짝", 두개있는경우 "박수짝짝", 하나도 없으면 "박수 없음" 을
        // 출력하는 프로그램을 작성하라. 예를 들면 13인 경우 "박수짝", "36인경우 박수짝짝", 5인경우 박수없음을 출력하면된다.

        // 입력
        Scanner sc = new Scanner(System.in);
        // 1~99까지의 정수
        // 박수 3,6,9
        int num = sc.nextInt();

        // 10의 자리 숫자를 저장할 변수
        int first = num / 10;
        // 1의 자리 숫자를 저장할 변수
        int second = num % 10;
        boolean resultFirst = false;
        boolean resultSecond = false;

        if (first == 0) {
            first = 1;
        }
        if (second == 0) {
            second = 1;
        }
        if (num > 0 && num < 100) {
            if (first % 3 == 0) {
                resultFirst = true;
            }
            if (second % 3 == 0) {
                resultSecond = true;
            }
            // or 연산을 통해서 10의자리와 1의자리에 3의 배수가 몇개 잇는지 연산
            if (resultFirst || resultSecond) {
                // and 연산을 통해서 10의 자리와 1의 자리에 모두 3의 배수가 있는지 확인
                if (resultFirst && resultSecond) {
                    System.out.println("박수짝짝");
                } else {
                    System.out.println("박수짝");
                }
            } else {
                System.out.println("박수 없음");
            }

        } else {
            System.out.println("1~99 사이의 정수로 입력해주세요.");
        }


        sc.close();
    }
}
