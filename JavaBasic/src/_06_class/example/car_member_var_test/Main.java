package _06_class.example.car_member_var_test;

public class Main {
    public static void main(String[] args) {
        // 생성된 인스턴스의 주소를 Car클래스 타입 변수 myCar에 저장
        Car myCar = new Car();

        // instance mycar의 ( 멤버 변수 )를 호출하여 사용
        System.out.println(myCar.company);
        System.out.println(myCar.color);
        System.out.println(myCar.speed);
        System.out.println(myCar.model);
        System.out.println(myCar.maxSpeed);
        System.out.println(myCar.price);
        System.out.println(myCar.displacement);
        System.out.println(myCar.ev);
        myCar.speed = 60;
        System.out.println(myCar.maxSpeed);

        Car car1 = new Car();
        Car car2 = new Car();
        
    }
}
