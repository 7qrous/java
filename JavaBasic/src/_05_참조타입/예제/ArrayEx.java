package _05_참조타입.예제;

public class ArrayEx {
    public static void main(String[] args) {
        // array : 하나의 배열명으로 지정한 데이터 타입의 데이터를 여러개 저장할 수 있는 데이터 타입
        // 배열은 한번 생성되면 배열의 크기를 변경할 수 없음
        // 선언과 동시에 입력하는 데이터 수의 따라서 배열의 크기가 결정
        // 선언과 동시에 값 배열의 각 항목에 순서대로 값 대입, 데이터 입력시 { } 를 사용하고 각각의 데이터는 ,로 구분한다.
        System.out.println("1번방식");
        int scores[] = {80, 90, 70, 100, 80};
        System.out.println(scores); // addr
        System.out.println(scores[0]);
        System.out.println(scores[1]);
        System.out.println(scores[2]);
        System.out.println(scores[3]);
        System.out.println(scores[4]);
        System.out.println("\n2번방식");

        int arr2[] = new int[5];
        System.out.println(arr2);
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

    }
}
