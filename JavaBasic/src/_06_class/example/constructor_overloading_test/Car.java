package _06_class.example.constructor_overloading_test;

public class Car {
    // 클래스의 필드(멤버변수)
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    // 클래스의 생성자
    public Car() {
    }

    //매개변수의 개수는 같지만 데이터 타입이 다르기 때문에 생성자 오버로딩이 가능함
    public Car(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    // 매개변수가 있는 생성자
    public Car(String model) {
        this.model = model;
    }

    // 생성자의 매개변수의 개수는 같지만 매개변수의 데이터타입이 다르므로 생성자 오버로딩이 가능함
    public Car(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;

    }

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    // 생성자 오버로딩: 하나의 클래스에서 여러개의 생성자를 선언하여 사용하는 것
    // 생성자가 가지고 있는 매개변수의 데이터타입, 개수, 순서가 다를 경우 생성자 오버로딩으로 사용할 수 있음
    // 순서의 경우는 데이터타입의 순서로 판단
    public Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public Car(int maxSpeed, String model, String color) {

        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }


}
