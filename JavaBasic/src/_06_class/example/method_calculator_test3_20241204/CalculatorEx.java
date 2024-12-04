package _06_class.example.method_calculator_test3_20241204;

public class CalculatorEx {
    public static void main(String[] args) {
        Calculator myCal = new Calculator();
        myCal.powerOn();
        int result1 = myCal.plus(10, 3);
        System.out.println("result1:" + result1);
        double result2 = myCal.divide(10, 3);
        System.out.println("result2:" + result2);
        myCal.powerOff();
    }
}
