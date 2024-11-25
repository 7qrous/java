import java.util.Scanner;

public class Quiz1 {
    public static void main(String[] args) {
        
        System.out.print("두 정수를 입력하세요>>");
        
        
        // 키보드 입력을 받기 위한 스캐너 객체 생성
        Scanner sc = new Scanner(System.in);
        
        // 키보드로 정수 입력 받기
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        // 출력
        System.out.println(a + "+" + b + "은 " + (a + b));
        sc.close();
    }
}
