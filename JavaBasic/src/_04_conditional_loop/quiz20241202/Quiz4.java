package _04_conditional_loop.quiz20241202;

import java.util.Scanner;

public class Quiz4 {
    public static void main(String[] args) {
        // 교재 127페이지 6번문제
        // 영문 한글 배열 2개 생성,
        // while문으로 무한반복, if~else문으로 "exit" 들어왔는지 확인 - break
        // if문으로 문자열 값과 영문 배열 비교, index찾고 한글 배열에 해당 index사용하는 위치값 출력
        String eng[] = {"student", "love", "java", "happy", "future"};
        String kor[] = {"학생", "사랑", "자바", "행복한", "미래"};

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("영어 단어를 입력하세요:>>");
            String str = sc.next();
            if (str.equals("exit")) {
                System.out.println("종료합니다...");
                break;
            }
            int idx = -1;
            for (int i = 0; i < eng.length; i++) {
                if (str.equals(eng[i])) {
                    idx = i;
                    break;
                }
            }
            if (idx < 0) {
                System.out.println("그런 영어 단어가 없습니다.");
            } else {
                System.out.println(kor[idx]);
            }
        }
        sc.close();
    }
}
