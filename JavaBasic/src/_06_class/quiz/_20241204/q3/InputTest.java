package _06_class.quiz._20241204.q3;

import java.util.Scanner;

public class InputTest {
    Scanner sc = new Scanner(System.in);

    void input() {
        String titles[] = {"국어", "영어", "수학"};
        for (int i = 0; i < titles.length; i++) {
            inputScore(titles[i]);
        }
    }

    int inputScore(String title) {
        System.out.print(title + ":");
        return sc.nextInt();
    }

    public static void main(String[] args) {
        InputTest inputTest = new InputTest();
        inputTest.input();
    }
}
