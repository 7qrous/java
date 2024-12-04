package _06_class.example.car_instance_member_test;

public class Main {
    public static void main(String[] args) {
        // car 클래스 타입의 변수 car1을 생성, new 키워드와  Car() 생성자를 호출하여 객체 생성 및 주소저장
        Car car1 = new Car("포르쉐");
        // car2를 생성
        Car car2 = new Car("현대자동차");
        // car1과 2는 동일한 클래스를 바탕으로 생성된 객체이지만 서로 다른 객체임
        car1.run();
        car2.run();
    }
}
