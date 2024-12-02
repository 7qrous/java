package _03_operator;

public class AssignmentOpEx {
    public static void main(String[] args) {
        // 변수 result 선언과 동시에 0으로 초기화
        // 대입 연산자를 사용하여 변수에 정수 0을 입력
        int result = 0;

        // 대입 연산자를 연산 순위가 가장 느리므로 10 + result가 연산됨
        // result + 10한 결과를 변수 result에 대입
        result = result + 10;
        System.out.println(result);

        String str = "";
        str += "추가된 문자열 ";
        str += "다시 추가한 문자열 ";
        str += "또 다시 추가한 문자열 ";
        str += "마지막으로 추가한 문자열 ";
        System.out.println(str);

        // 복합 대입 연산자 += 사용
        // +=의 의미는 result = result + 10;과 동일
        result += 10;
        System.out.println(result);

        // -=의 의미는 result = result - 10;과 동일
        result -= 10;
        System.out.println(result);

        // *=의 의미는 result = result * 10;과 동일
        result *= 10;
        System.out.println(result);

        // /=의 의미는 result = result / 10;과 동일
        result /= 10;
        System.out.println(result);

        // /=의 의미는 result = result % 3;과 동일
        result %= 3;
        System.out.println(result);
    }
}
