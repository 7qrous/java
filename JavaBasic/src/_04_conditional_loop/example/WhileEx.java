package _04_conditional_loop.example;

public class WhileEx {
    public static void main(String[] args) {
        /*
         *
         * while : for 문과 같이 프로그래밍 언어에서 자주사용하는 반복문
         * while 키워드 뒤에 반복조건을 입력하고 반족 조건의 결과가 true이면 코드 블록의 내용을 반복 실행함
         * for문과의 차이점 : 초기화 변수를 while문 외부에 선언하고 while문 내부에서 사용함, 증감식을 반복 소스코드가 있는 코드 블록 안에서 실행
         * while 문을 연속적으로 사용할 경우 같은 초기화 변수를 사용하면 2번째 while문이 실행되지 않을 수 있음
         * 첫 번째 while문 사용 후 초기화 변수의 값이 그대로 있음
         * 코드 블록 내에서의 증감식 위치에 따라 출력 되는 결과가 달라짐
         * 증감식을 생략할 경우 무한반복이 될 수 있음
         *
         */

        // 기본적인 while문 사용
        int i = 0;// 초기화 변수 선언
        while (i < 10) { // while문 선언 및 반복 조건식 입력
            System.out.println(i); //반복 실행할 소스코드
            i++; // 증감식
        }
        System.out.println("\n----- while문으로 1~10까지의 총합");
        int total = 0;
        int count = 1;
        while (count < 11) {
            total += count;
            System.out.println("count:" + count + ", total:" + total);
            count++;
        }
        System.out.println("1~10까지의 총합은 " + total + "입니다.");
        System.out.println("\n ------ while2번 사용시 주의");

        int j = 0;
        // 첫 번째 while문은 초기화 변수 값이 0으로 시작됨
        System.out.println("첫 번째 while문 실행");
        while (j < 5) {
            System.out.println("j의 값 : " + j);
            j++;
        }
        // j= 0; // while문 사용 전 초기화 진행
        // 두 번째 while문은 초기화 변수 j의 값이 이미 5이기 때문에 while문의 반복 조건에 맞지 않음
        System.out.println("두 번째 while문 실행");
        while (j < 5) {
            System.out.println("두 번째 while문에서 j의 값 " + j);
            j++;
        }
        System.out.println("\n ---- for문 2번 연속 시 --- \n");
        for (int k = 0; k < 10; k++) {
            System.out.println("첫 번째 for문에서 k의 값" + k);
        }
        for (int k = 0; k < 10; k++) {
            System.out.println("두 번째 for문에서 k의 값" + k);
        }

        System.out.println("\n-- 증감식의 위치에 따라 다른 결과 --");
        int c = 0;
        while (c < 11) {
//            c++;         // 증감식을 먼저 실행 후 나머지 실행
            System.out.println("나무꾼이 도끼로 나무를 " + c + "번 찍습니다.");
//            c++;         // 반복 소스코드 중간에 증감식을 실행
            if (c == 10) {
                System.out.println("나무가 넘어갑니다.");
                break;
            }
            c++;
        }
    }
}
