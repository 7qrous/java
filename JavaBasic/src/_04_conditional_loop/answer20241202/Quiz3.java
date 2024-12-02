package _04_conditional_loop.answer20241202;

import java.util.Arrays;
import java.util.Scanner;

//126.p - 5
public class Quiz3 {

    public static void main(String[] args) {

        int arr[] = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 10개 입력:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int big = 0;
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length; i++) {
                // i + 1인 index가 배열의 마지막 index를 넘지 못하도록 하는 제어문
                // 배열.length-1은 해당 배열의 마지막 index가 됨
                // i가 마지막 index까지 못가고, i+1이 마지막 index가 될 수 있도록 함
                if (i + 1 < arr.length) {
                    // i index인 값과 i+1  인 값을 비교하여 i의 값이 더 클 경우 변수에 저장
                    if (arr[i] > arr[i + 1]) {
                        big = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = big;
                    }
                }

            }
        }

        System.out.println(big);
        System.out.println(Arrays.toString(arr));
    }
}
