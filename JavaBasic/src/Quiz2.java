import java.util.Scanner;

public class Quiz2 {
    public static void main(String[] args) {
        System.out.print("몇 층인지 입력하세요>>");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n*5+"m 입니다.");
        sc.close();
    }
}
