import java.util.Scanner;

public class Quiz1 {
    public static void main(String[] args) {
        System.out.print("두 정수를 입력하세요>>");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a + "+" + b + "은 " + (a + b));
        sc.close();
    }
}
