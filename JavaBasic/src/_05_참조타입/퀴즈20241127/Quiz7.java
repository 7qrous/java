package _05_참조타입.퀴즈20241127;


// 주어진 배열의 내용을 역순으로 출력하세요
public class Quiz7 {
    public static void main(String[] args) {
        int array[] = {10, 20, 30, 40, 50};
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }

    }
}
