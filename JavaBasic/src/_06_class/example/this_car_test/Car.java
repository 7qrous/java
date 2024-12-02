package _06_class.example.this_car_test;

public class Car {
    // 클래스의 필드(멤버변수)
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    // this() : 생성자 안에서 또 다른 생성자를 호출하는 명령어
    public Car() {
        // this() : 생성자 안에서 가장 먼저 실행되어야 함;
//        System.out.println("기본 생성자 사용");
        this("아반테");
        System.out.println("기본 생성자 사용");
    }

    public Car(int maxSpeed) {
        this.maxSpeed = maxSpeed;
        this.model = "ev3";
        this.color = "회색";
    }

    public Car(String model) {
        this(model, "은색");
    }

    public Car(String model, String color) {
        this(model, color, 200);
    }

    public Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
