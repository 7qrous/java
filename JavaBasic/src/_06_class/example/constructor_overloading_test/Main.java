package _06_class.example.constructor_overloading_test;

public class Main {
    public static void main(String[] args) {
        // Car 클래스 타입의 변수 car01을 선언과 동시에 객체 생성
        // 기본 생성자를 사용하여 객체 생성
        Car car01 = new Car();
        System.out.println("car01.company: " + car01.company);
        System.out.println();

        // Car 클래스 타입의 변수 car02을 선언과 동시에 객체 생성
        // 매개변수가 1개인 생성자를 사용하여 객체 생성
        Car car02 = new Car("EV5");
        System.out.println("car02.company: " + car02.company);
        System.out.println("car02.model: " + car02.model);
        System.out.println();

        // 매개 변수가 2개인 생성자를 사용하여 객체 생성
        Car car03 = new Car("ev5", "흰색");
        System.out.println("car03.company: " + car03.company);
        System.out.println("car03.model: " + car03.model);
        System.out.println("car03.color: " + car03.color);
        System.out.println();

        // 매개변수의 개수는 같지만 매개변수의 데이터타입의 순서가 다르기때문에 오버로딩이 가능하다
        // 매개 변수가 3개인 생성자를 사용하여 객체 생성
        Car car04 = new Car("ev5", "흰색", 250);
        System.out.println("car04.company: " + car04.company);
        System.out.println("car04.model: " + car04.model);
        System.out.println("car04.color: " + car04.color);
        System.out.println("car04.color: " + car04.maxSpeed);
        System.out.println();

        Car car05 = new Car(250, "ev5", "흰색");
        System.out.println("car05.company: " + car05.company);
        System.out.println("car05.model: " + car05.model);
        System.out.println("car05.color: " + car05.color);
        System.out.println("car05.color: " + car05.maxSpeed);
        System.out.println();

        Car car06 = new Car("ev5", 250);
        System.out.println("car06.company: " + car06.company);
        System.out.println("car06.model: " + car06.model);
        System.out.println("car06.color: " + car06.color);
        System.out.println("car06.color: " + car06.maxSpeed);
        System.out.println();

        Car car07 = new Car(250);
        System.out.println("car07.company: " + car07.company);
        System.out.println("car07.model: " + car07.model);
        System.out.println("car07.color: " + car07.color);
        System.out.println("car07.color: " + car07.maxSpeed);
        System.out.println();
    }
}
