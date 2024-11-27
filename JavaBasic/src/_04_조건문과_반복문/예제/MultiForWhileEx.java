package _04_조건문과_반복문.예제;

public class MultiForWhileEx {
    public static void main(String[] args) {

        System.out.println("기본 ");
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\n--- 중첩 For문 ---");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("[i:" + i + ", j:" + j + "], ");
            }
            System.out.println();
        }

        System.out.println("\n--- 일반 While문 ---");
        int count = 0;
        while (count < 5) {
            System.out.print(count + " ");
            count++;
        }
        System.out.println("\n--- 중첩 While문 ---");
        int c1 = 0; //외부 while문용 초기화 변수
        int c2 = 0;  // 내부 while문용 초기화 변수
        while (c1 < 5) {
            while (c2 < 5) {
                System.out.print("[c1 : " + c1 + ", c2 :" + c2 + "], ");
                c2++; // 내부 while문용 증감식
            }
            c2 = 0;
            System.out.println();
            c1++; // 외부 while문용 증감식
        }


        // 코드 블록 안에 선언한 변수는 코드 블록이 종료되면 메모리에서 삭제
        int c3 = 0;
        while (c3 < 5) {
            int c4 = 0;
            while (c4 < 5) {
                System.out.print("[c3 : " + c3 + ", c4 :" + c4 + "], ");
                c4++; // 내부 while문용 증감식
            }
            System.out.println();
            c3++; // 외부 while문용 증감식
        }
    }

}
