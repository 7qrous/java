package _04_conditional_loop.quiz20241202;

public class Quiz5 {
    public static void main(String[] args) {
        int numbers[] = {5, 12, 8, 20, 7};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println(max);
    }
}
