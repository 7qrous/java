package _06_class.example.java_user_input;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter useName");
        String userName = myObj.nextLine();
        System.out.println("Username is : " + userName);

    }
}
