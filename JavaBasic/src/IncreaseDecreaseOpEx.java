public class IncreaseDecreaseOpEx {
    public static void main(String[] args) {

        // int 타입의 변수 x에 데이터 10 저장
        int x = 10;

        // 화면,출력
        System.out.println("x=" + x);

        // 증감 연산자 사용, 피연산자 앞에 사용
        ++x;

        // 증감 연산자 사용, 피 연산자 뒤에 사용;
        System.out.println("x=" + x);
        x++;
        // 출력
        System.out.println("x=" + x);

        System.out.println("\n ------------------ \n");
        x = 10;
        System.out.println("x=" + x);
        System.out.println("x 값 증가" + ++x);
        System.out.println("x=" + x);

        // 증감 연산자를 다른 연산식과 함께 사용 시 변수 뒤에 사용하면 증감 연산자가 나중에 실행됨
        System.out.println("x 값 증가" + x++);
        System.out.println("x=" + x);
        System.out.println("x 값 감소" + x--);
        System.out.println("x=" + x);
        System.out.println("x 값 감소" + --x);
        System.out.println("x=" + x);
    }
}
