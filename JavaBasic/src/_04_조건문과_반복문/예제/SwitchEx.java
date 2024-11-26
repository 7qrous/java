package _04_조건문과_반복문.예제;

public class SwitchEx {
    public static void main(String[] args) {
        // Math.random() : 0.0 ~ 0.9 까지의 숫자 중 랜덤으로 숫자를 출력
        // (int) (Math.random() * 출력하고 싶은 최대값 ) + 최소값; 으로 사용
        int num = (int) (Math.random() * 6) + 1; // 최소 1부터 최대 6까지

        // switch ~ case : if 문과 함꼐 프로그래밍 에서 자주 사용하는 제어문
        // if 문과는 다르게 조건식이 아닌 값을 입력
        // switch 문과 함께 사용하는 case 와 동일한 값을 찾아서 실행
        // 입력한 값이 case와 일치하는 것이 없을 경우 default 실행
        // default는 if문의 else문과 비슷한 역할을 하며 생략 가능합니다.
        switch (num) {
            case 1:
                System.out.println("1 번이 나왔습니다.");
                break;
            case 2:
                System.out.println("2 번이 나왔습니다.");
                break;
            case 3:
                System.out.println("3 번이 나왔습니다.");
                break;
            case 4:
                System.out.println("4 번이 나왔습니다.");
                break;
            case 5:
                System.out.println("5 번이 나왔습니다.");
                break;
            default:
                System.out.println("6 번이 나왔습니다.");
                break;
        }
    }
}
