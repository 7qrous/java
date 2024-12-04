package _06_class.example.car_instance_member_test;

public class Car {
    // 멤버 변수 선언 ( 필드 )
    String model;
    int speed;

    // 생성자 선언
    Car(String model) {
        // 매개변수로 받은 model을 필드인 model 저장
        this.model = model;
    }

    Car(String model, int speed) {
        this.model = model;
    }

    // 매개변수로 speed를 필드인 speed에 저장
    void setSpeed(int speed) {
        this.speed = speed;
    }

    // 자기자신의 멤버인 setSpeed(i)를 실행
    void run() {
        for (int i = 10; i <= 50; i += 10) {
//            this.setSpeed(i);
            setSpeed(i);
            System.out.println(this.model + "가 달립니다. (시속 :  " + i + "km/h)");
        }
    }
}
