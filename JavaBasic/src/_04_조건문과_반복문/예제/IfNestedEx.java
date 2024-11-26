package _04_조건문과_반복문.예제;

public class IfNestedEx {
    public static void main(String[] args) {

        // Math.random() : 자바에서 제공하는 임의의 숫자를 출력 ( 0.0 ~ 0.9 )
        // Math.random() * 정수 + 1 = 최소 1 ~ 지정한 정수까지 임의의 숫자를 출력
        int score = (int) (Math.random() * 20) + 81;
        System.out.print("점수 : " + score);
        String grade = "";

        // if문 안에 if문을 중첩해서 사용
        if (score >= 90) {
            if (score >= 95) {
                grade = "A+";
            } else {
                grade = "A";
            }
        } else {
            if (score >= 85) {
                grade = "B+";
            } else {
                grade = "B";
            }
        }
        System.out.println("학점 : " + grade);
    }
}
