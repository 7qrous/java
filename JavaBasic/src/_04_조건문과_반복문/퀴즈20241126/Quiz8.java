package _04_조건문과_반복문.퀴즈20241126;

// 1부터 50까지의 숫자 중 홀수만 화면에 출력하는 프로그램을 반복문을 사용하여 작성하세요
public class Quiz8 {
    public static void main(String[] args) {
        for (int i = 1; i < 51; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
    }
}
