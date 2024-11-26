package _04_조건문과_반복문.예제;

public class WhileEx {
    public static void main(String[] args) {


        /*
         *
         * while : for 문과 같이 프로그래밍 언어에서 자주사용하는 반복문
         * while 키워드 뒤에 반복조건을 입력하고 반족 조건의 결과가 true이면 코드 블록의 내용을 반복 실행함
         * for문과의 차이점 : 초기화 변수를 while문 외부에 선언하고 while문 내부에서 사용함, 증감식을 반복 소스코드가 있는 코드 블록 안에서 실행
         * while 문을 연속적으로 사용할 경우 같은 초기화 변수를 사용하면 2번째 while문이 실행되지 않을 수 있음
         * 코드 블록 내에서의 증감식 위치에 따라 출력 되는 결과가 달라짐
         *
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
    }
}
