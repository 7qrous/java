package _05_reference_type.example;

public class MainArgsTest {
    public static void main(String[] args) {
        // 실행시 옵션으로 입력받은 문자열 타입의 배열의 크기가 2인지 확인
        // 구성편집에서 실행 ( Intelli J - 프로그램 인수 10 20 추가하면 30으로 출력)
        if (args.length != 2) {
            System.out.println("How to use program");
            System.out.println("java MainArgsTest num1 num2");
            // 프로그램 종료
            System.exit(0);
        }
        // 문자열 타입 배열의 0번 인덱스에서 데이터 가져오기
        String strNum1 = args[0];
        // 문자열 타입 배열의 1번 인덱스에서 데이터 가져오기
        String strNum2 = args[1];


        // 문자열 타입의 데이터를 정수로 변환
        int num1 = Integer.parseInt(strNum1);
        int num2 = Integer.parseInt(strNum2);
        int result = num1 + num2;
        System.out.println(num1 + "+" + num2 + "=" + result);
    }
}
