package _06_class.example.method_calculator_test1;

public class Main {
    public static void main(String[] args) {
        // Calculator class type의 객체 c를 생성
        Calculator c = new Calculator();
        // Calculator class에서 제공하는 멤버인 powerOn() 메소드를 호출
        c.powerOn();
        // 인스턴스 c가 가지고 있는 멤버인 plus() 메소드를 호출
        // plus() 호출 시 매개변수로 데이터 2개를 전달하고 결과를 받아옴
        int r1 = c.plus(10, 20);
        System.out.println(r1);
        int x = 10;
        int y = 3;
        // 인스턴스 c가 가지고 있는 멤버인 divide()메소드를 호출
        // divide() 호출 시 매개변수 데이터로 2개를 전달하고 결과를 받아옴
        double r2 = c.divide(x, y);
        System.out.println(r2);
        // 인스턴스 c가 가지고 있는 멤버 powerOff()를 호출
        c.powerOff();
    }
}
