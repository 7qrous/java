package _03_operator;

public class LogicalOpEx {
    public static void main(String[] args) {
        // 문자 A는 10진수로 65
        int charCode = 'A';
        if ((charCode) >= 65 && charCode <= 90) {
            System.out.println("대문자 입니다.");
        }
        if ((charCode) >= 97 && charCode <= 122) {
            System.out.println("소문자 입니다.");
        }

        //  charCode의 값이 65 이므로 charCode < 48은 false이나 !연산에 의해서
        //  결과값이 true가 됨
        //  charCode의 값이 65이므로 charCode > 57은 true 이나 !연산에
        // 의해서 결과값 true가 됨.
        if (!(charCode < 48) && !(charCode > 57)) {
            System.out.println("0 ~ 9까지의 숫자 입니다.");
        }
        int value = 4;
        // value % 2 연산이 먼저 발생하고 결과값 == 0 연산이 진행
        // value % 3 연산이 먼저 발생하고 결과값 == 0 연산이 진행
        // 왼쪽 결과값 true와 오른쪽 결과값 false 를 OR 연산시 true
        if ((value % 2 == 0) || (value % 3 == 0)) {
            System.out.println("2 또는 3의 배수 입니다.");
        }
    }
}