package _06_class.example.this_car_test;

public class Main {
    public static void main(String[] args) {
        Car car01 = new Car();
        Car car02 = new Car("EV3");
        Car car03 = new Car("EV3", "회색");
        Car car04 = new Car("EV3", "회색", 200);

        System.out.println("car01.company: " + car01.company);
        System.out.println("car01.model: " + car01.model);
        System.out.println("car01.color: " + car01.color);
        System.out.println("car02.maxSpeed: " + car01.maxSpeed);
        System.out.println();
        System.out.println("car02.company: " + car02.company);
        System.out.println("car02.model: " + car02.model);
        System.out.println("car02.color: " + car02.color);
        System.out.println("car02.maxSpeed: " + car02.maxSpeed);
        System.out.println();
        System.out.println("car03.company: " + car03.company);
        System.out.println("car03.model: " + car03.model);
        System.out.println("car03.color: " + car03.color);
        System.out.println("car03.maxSpeed: " + car03.maxSpeed);
        System.out.println();
        System.out.println("car04.company: " + car04.company);
        System.out.println("car04.model: " + car04.model);
        System.out.println("car04.color: " + car04.color);
        System.out.println("car04.maxSpeed: " + car04.maxSpeed);
    }
}
