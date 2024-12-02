package _04_conditional_loop.answer20241202;

public class Quiz5 {
    public static void main(String[] args) {
        int numbers[] = {5, 12, 8, 20, 7};
        int big = 0; // 비교 후 더 큰 수를 저장하기 위한 변수
        for (int i = 0; i < numbers.length; i++) {
            // i + 1인 index가 배열의 마지막 index를 넘지 못하도록 하는 제어문
            // 배열.length-1은 해당 배열의 마지막 index가 됨
            // i가 마지막 index까지 못가고, i+1이 마지막 index가 될 수 있도록 함
            if (i + 1 < numbers.length) {
                // i index인 값과 i+1  인 값을 비교하여 i의 값이 더 클 경우 변수에 저장
                if (numbers[i] > numbers[i + 1]) {
                    big = numbers[i];
                }
            }

        }
        System.out.println(big);

    }
}

/*
 *
 * i > i + 1 ;
 *0 < 4;
 * 5 > 12 ; false ; big = 0;
 * 1 < 4 ;
 *
 * 12 > 8 ; true ; big = 12;
 * 2 < 4; true;
 * 8 > 20; false ; big = 12;
 *
 * 3 < 4; true;
 * 20 > 7; true ; big = 20;
 *
 * 4 < 4; false
 * big 출력
 * */
