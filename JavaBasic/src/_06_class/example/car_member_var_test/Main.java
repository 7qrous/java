package _06_class.example.car_member_var_test;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        System.out.println(myCar.company);
        System.out.println(myCar.color);
        System.out.println(myCar.speed);
        System.out.println(myCar.maxSpeed);
        myCar.speed = 60;
        System.out.println(myCar.maxSpeed);
    }
}
