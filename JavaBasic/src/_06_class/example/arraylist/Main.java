package _06_class.example.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }

        System.out.println("--");
        Collections.sort(cars);
        for (String i : cars) {
            System.out.println(i);
        }
        Collections.sort(cars, Collections.reverseOrder());

        for (String i : cars) {
            System.out.println(i);
        }
    }
}
