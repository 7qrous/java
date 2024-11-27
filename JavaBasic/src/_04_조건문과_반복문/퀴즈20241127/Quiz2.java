package _04_조건문과_반복문.퀴즈20241127;

public class Quiz2 {
    public static void main(String[] args) {
        int su = 1;
        while (su < 10) {
            int dan = 2;
            while (dan < 10) {
                System.out.printf("%d*%d=%2d ", dan, su, (su * dan));
                dan++;
            }
            su++;
            System.out.println();
        }
    }
}
