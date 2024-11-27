package _05_참조타입.퀴즈20241127;

// int 타입의 배열을 10크기로 지정하여 생성하고,
// 데이터를 1~10까지 각각의 index에 저장한 후
// 배열에 저장된 모든 데이터의 총합을 구하는
// 프로그램을 작성하세요.
public class Quiz5 {
    public static void main(String[] args) {
        int array[] = new int[10];
        int sum = 0;
        for (int i = 1; i <= array.length; i++) {
            array[i - 1] = i;
            sum += array[i - 1];
        }
        System.out.println(sum);
    }
}
