package _05_reference_type.example;

/**
 * 2024-12-02
 */
public class AdvancedForEx {
    public static void main(String[] args) {
        int scores[] = {95, 71, 84, 93, 87};
        System.out.println("---- 일반 for문으로 모든 내용 출력");
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }
        System.out.println("\n---- 향상된 for문으로 모든 내용 출력");
        for (int score : scores) {
            System.out.println(score);
        }
        System.out.println();
    }
}
