package _04_조건문과_반복문.예제;

public class For1to10Ex {
    public static void main(String[] args) {
        // for : 프로그래밍에서 자주 사용하는 반복문
        // 반복 실행할 횟수가 정해져 있을 경우 주로 사용함.
        // 구성은 초기화 변수, 조건식, 증감식, 반복으로 구성되어 있음
        // 초기화 변수는 for문 실행시 첫 번째 반복에서만 1번 실행됨
        // 초기화 변수는 for문 내부에서 사용되고, for문 밖에서는 삭제됨
        // 조건식의 결과가 true이면 코드 블록 안의 코드를 반복 실행함
        // 코드 블록 안의 코드를 모두 실행 후 증감식으로 이동
        // 증감식을 통해서 초기화 변수의 값을 변경
        // 다시 조건 확인하여 true이면 for문에서 탈출

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println("나무꾼이 나무를 " + i + "번 찍습니다.");
        }
        System.out.println("나무가 넘어갑니다.");
        // i는 for문 내부에서 선언되엇기 때문에 for문 밖에서 사용할 수 없음
        // System.out.println(i);

        int total = 0;
        for (int i = 1; i < 11; i++) {
            total = total + i;
            System.out.println("i:" + i + ", total:" + total);
        }
        System.out.println("1 ~ 10 총합은 " + total + "입니다.");
        System.out.println("\n --- 실수 데이터로 for문 사용 --- ");


        double dTotal = 0.0;
        for (double x = 0.1; x <= 1.0; x += 0.1) {
            dTotal = dTotal + x;
            System.out.println("x:" + x + ", dTotal:" + dTotal);
        }
    }
}
