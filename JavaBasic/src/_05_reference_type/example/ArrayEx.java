package _05_reference_type.example;

public class ArrayEx {
    public static void main(String[] args) {
        // array : 하나의 배열명으로 지정한 데이터 타입의 데이터를 여러개 저장할 수 있는 데이터 타입
        // 배열은 한번 생성되면 배열의 크기를 변경할 수 없음
        // 선언과 동시에 입력하는 데이터 수의 따라서 배열의 크기가 결정
        // 선언과 동시에 값 배열의 각 항목에 순서대로 값 대입, 데이터 입력시 { } 를 사용하고 각각의 데이터는 ,로 구분한다.
        System.out.println("1번방식");
        int scores[] = {80, 90, 70, 100, 80};
        System.out.println(scores); // addr
        System.out.println(scores.length);
        System.out.println(scores[0]);
        System.out.println(scores[1]);
        System.out.println(scores[2]);
        System.out.println(scores[3]);
        System.out.println(scores[4]);

        System.out.println("\n2번방식");
        int arr2[] = new int[5];
        System.out.println(arr2);
        System.out.println(arr2.length);
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);
        System.out.println(arr2[3]);
        arr2[0] = 10;
        arr2[1] = 20;
        arr2[2] = 30;
        arr2[3] = 40;
        arr2[4] = 50;
        System.out.println(arr2);
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);
        System.out.println(arr2[3]);


        System.out.println("\n ---- 3번 방식으로 배열 선언 ---- ");
        int arr3[];
//        초기화를 하지 않으면 사용불가
//        System.out.println(arr3); // not initialized
//        System.out.println(arr3.length); // not initialized
        arr3 = new int[5];
        System.out.println(arr3);
        System.out.println(arr3.length);
        arr3[0] = 10;
        arr3[1] = 20;
        arr3[2] = 30;
        System.out.println(arr3[0]);
        System.out.println(arr3[1]);
        System.out.println(arr3[2]);

        int arr4[];
        arr4 = new int[]{10, 20, 30};
        System.out.println(arr4);
        System.out.println(arr4.length);
        System.out.println(arr4[0]);
        System.out.println(arr4[1]);
        System.out.println(arr4[2]);

        System.out.println("-------------");
        int arr5[] = new int[5];
        // 배열에 입력
        arr5[0] = 10;
        arr5[1] = 20;
        arr5[2] = 30;
        arr5[3] = 40;
        arr5[4] = 50;

        // 배열에 저장된 내용을 직접 모두 출력
        System.out.println(arr5[0]);
        System.out.println(arr5[1]);
        System.out.println(arr5[2]);
        System.out.println(arr5[3]);
        System.out.println(arr5[4]);
        System.out.println("\n---- 배열과 반복문");
        for (int i = 0; i < 5; i++) {
            System.out.println(arr5[i]);
        }
        for (int i = 0; i < arr5.length; i++) {
            System.out.println(arr5[i]);
        }
//        System.out.println(arr5[5]); // err : 배열의 최대 크기를 벗어나서 데이터를 저장하거나 가져올 수 없음


    }
}
