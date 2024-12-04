package _06_class.example.method_car_test_20241204;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.keyTurnOn();
        myCar.run();
        int speed = myCar.getSpeed();
        System.out.println("Speed: " + speed + "km/s");

        /* 메소드의 4가지 형태 */
    }
}
