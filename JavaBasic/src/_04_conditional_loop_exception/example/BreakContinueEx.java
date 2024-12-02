package _04_conditional_loop_exception.example;

public class BreakContinueEx {
    public static void main(String[] args) {
        System.out.println("--break--");
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println("i:" + i);
        }

        System.out.println("--continue--");
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println("i:" + i);
        }

        System.out.println("--break--");
        int c1 = 0;
        while (c1 < 10) {
            if (c1 == 3) {
                break;
            }
            System.out.println("c1:" + c1);
            c1++;
        }
        // while문에서 continue문을 사용할 경우 continue 문이 실행되는 위치가
        // 증감식보다 먼저 있을 경우 초기화 변수 값이 변경되지 않아서 무한루프에 빠질 수 있음
        /*
        System.out.println("--continue--");
        c1 = 0;
        while (c1 < 10) {
            if (c1 == 3) {
                continue;
            }
            System.out.println("c1:" + c1);
            c1++;
        }
        */

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 3) {
                    // 중첩 반복문에서 break를 만나면 가장 가까운 현재 실행중인 반복문을 종료합니다.
                    System.out.println("break 실행");
                    break;
                }
                System.out.println("i:" + i + ", j:" + j);
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 3) {
                    // 중첩 반복문에서 continue를 만나면 가장 가까운, 현재 실행중인 반복문의 현재 루프를 종료하고 다음 루프로 이동합니다.
                    System.out.println("continue 실행");
                    continue;
                }
                System.out.println("i:" + i + ", j:" + j);
            }
        }

    }
}
