package _06_class.example.car_constructor_test2;

public class Car {
    // 사용자가 선언한 생성자
    // 생성자명 뒤에 있는 괄호에 변수(매개변수)가 있는 생성자
    // 사용자가 생성자를 하나라도 선언 시 컴파일러가 기본 생성자를 추가하지 않음
    public Car(String color, int cc) {

    }

    /*
     *  개발자가 생성자를 하나라도 선언시 컴파일러가 기본 생성자를 추가하지 않으므로 기본 생성자를 사용하려면 개발자가 직접 기본 생성자를 추가해야함
     *  public Car(){
     *  }
     * */
}
