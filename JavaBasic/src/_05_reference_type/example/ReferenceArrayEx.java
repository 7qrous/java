package _05_reference_type.example;

import java.util.Arrays;

public class ReferenceArrayEx {
    public static void main(String[] args) {
        // 참조타입인 String Class Type의 배열을 선언, 크기는 3
        String strArray[] = new String[3];
        // 참조 타입의 빈 배열이기 때문에 기본값인 null로 초기화됨
        System.out.println(strArray[0]);//null
        System.out.println(strArray[1]);//null
        System.out.println(strArray[2]);//null

//        System.out.println(strArray1[0]);
//        배열이 생성되지 않았기 때문에 사용 불가

//        배열의 지정된 index에 데이터 저장
        strArray[0] = "Java"; // 대입 방식으로 저장
        strArray[1] = "Java"; // 대입 방식으로 저장
        strArray[2] = new String("Java"); // new 키워드를 사용하여 데이터 저장

//        같은 데이터를 단순 대입하여 데이터를 저장했기 때문에 메모리에 데이터는 1개만 저장하고, 주소를 공유함
//        주소가 같으므로 비교 연산자의 결과가 같음
        System.out.println(strArray[0] == strArray[1]);
//        new를 통해서 새로운 주소에 데이터를 저장했으므로 주소가 다름
        System.out.println(strArray[0] == strArray[2]);
//        지정한 주소의 데이터가 같은지 비교
        System.out.println(strArray[0].equals(strArray[2]));
        System.out.println("\n---- 참조 타입에 저장되는 것이 주소인 것에 대한 증명 ");

        int arrNum1[] = {10, 20, 30};
        int arrNum2[] = new int[3];

        System.out.println("----- 원본 배열 arrNum1:");
        for (int i = 0; i < arrNum1.length; i++) {
            System.out.print(arrNum1[i] + " ");
        }
        System.out.println("----- 원본 배열 arrNum2:");
        for (int i = 0; i < arrNum2.length; i++) {
            System.out.print(arrNum2[i] + " ");
        }
        System.out.println(arrNum1);
        System.out.println(arrNum2);

        System.out.println("---- 배열 복사 후의 내용");

        arrNum2 = arrNum1;

        System.out.println(arrNum1);
        System.out.println(arrNum2);
        System.out.println("-----복사 후 배열 arrNum1:");
        for (int i = 0; i < arrNum1.length; i++) {
            System.out.print(arrNum1[i] + " ");
        }
        System.out.println("\n-----복사 후 배열 arrNum2:");
        for (int i = 0; i < arrNum2.length; i++) {
            System.out.print(arrNum2[i] + " ");
        }
        System.out.println("\n 배열2의 값 수정 후 내용");
        // 2번째 배열의 1번 인덱스만 수정
        arrNum2[1] = 200;
        // 참조 타입을 =로 단순 대입 시 주소가 복사됨
        // 같은 주소를 보고 있기 때문
        // 한쪽에서 수정 시 다른 쪽도 함께 수정된 것
        System.out.println("\n-----수정 후 배열 arrNum1:");
        for (int i = 0; i < arrNum1.length; i++) {
            System.out.print(arrNum1[i] + " ");
        }
        System.out.println("\n-----수정 후 배열 arrNum2:");
        for (int i = 0; i < arrNum2.length; i++) {
            System.out.print(arrNum2[i] + " ");
        }
        System.out.println("\n-----원본 배열 내용");
        int arrNum3[] = {10, 20, 30};
        int arrNum4[] = new int[3];
        System.out.println("-----복사 후 배열 arrNum3:");
        for (int i = 0; i < arrNum3.length; i++) {
            System.out.print(arrNum3[i] + " ");
        }
        System.out.println("\n-----복사 후 배열 arrNum4:");
        for (int i = 0; i < arrNum4.length; i++) {
            System.out.print(arrNum4[i] + " ");
        }
        System.out.println("--반복문으로 복사 후 내용--");
        for (int i = 0; i < arrNum3.length; i++) {
            arrNum4[i] = arrNum3[i];
        }
        System.out.println("-----복사 후 배열 arrNum3:");
        for (int i = 0; i < arrNum3.length; i++) {
            System.out.print(arrNum3[i] + " ");
        }
        System.out.println("\n-----복사 후 배열 arrNum4:");
        for (int i = 0; i < arrNum4.length; i++) {
            System.out.print(arrNum4[i] + " ");
        }
        arrNum4[1] = 200;
        System.out.println("\n\n-----복사 후 배열 arrNum3:");
        for (int i = 0; i < arrNum3.length; i++) {
            System.out.print(arrNum3[i] + " ");
        }
        System.out.println("\n-----복사 후 배열 arrNum4:");
        for (int i = 0; i < arrNum4.length; i++) {
            System.out.print(arrNum4[i] + " ");
        }
        /* 주소가 복사가 된것이 아니고 값 자체가 복사가 되었기 때문에 다르게 나옴*/

        System.out.println("\n System.arraycopy() 사용");

        int arrNum5[] = {10, 20, 30};
        int arrNum6[] = new int[3];

        for (int i = 0; i < arrNum5.length; i++) {
            System.out.print(arrNum5[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arrNum6.length; i++) {
            System.out.print(arrNum6[i] + " ");
        }
        System.out.println("\nSystem.arraycopy()");
        /*
         * arraycopy() : System 패키지에서 배열 복사를 위해서 사용하는 명령
         * 사용방법 : System.arraycopy(원본배열명, 원본의 시작인덱스, 사본 배열명, 사본에 입력할 index,  원본 시작 index부터 복사할 길이 )
         * */
        System.arraycopy(arrNum5, 0, arrNum6, 0, arrNum5.length);
        for (int i = 0; i < arrNum5.length; i++) {
            System.out.print(arrNum5[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arrNum6.length; i++) {
            System.out.print(arrNum6[i] + " ");
        }
        arrNum6[1] = 200;
        System.out.println();
        for (int i = 0; i < arrNum5.length; i++) {
            System.out.print(arrNum5[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arrNum6.length; i++) {
            System.out.print(arrNum6[i] + " ");
        }
        System.out.println();
        int arrNum7[] = {10, 20, 30};
        int arrNum8[] = new int[3];
        for (int i = 0; i < arrNum7.length; i++) {
            System.out.print(arrNum7[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arrNum8.length; i++) {
            System.out.print(arrNum8[i] + " ");
        }
        System.out.println();
        /* *
         *  copyOf : 자바에서 배열 관련 클래스인 Arrays 클래스에서 제공하는 배열 복사 명령
         *  원본의 0번 index 부터 지정한 크기만큼 복사
         *  사용방법 :
         *  사본배열명 = Arrays.copyOf(원본배열명, 복사할크기);
         *  copyOfRange() : 자바에서 배열 관련 클래스인 Arrays 제공하는 배열 복사 명령
         *  원본의 지정한 index부터 지정한 크기만큼 복사
         *  사용방법 : 사본 배열명 = Arrays.copyOfRange(원본배열명,시작위치,복사할크기);
         * */
        arrNum8 = Arrays.copyOf(arrNum7, arrNum7.length);
        for (int i = 0; i < arrNum7.length; i++) {
            System.out.print(arrNum7[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arrNum8.length; i++) {
            System.out.print(arrNum8[i] + " ");
        }
        arrNum8[1] = 200;
        for (int i = 0; i < arrNum7.length; i++) {
            System.out.print(arrNum7[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arrNum8.length; i++) {
            System.out.print(arrNum8[i] + " ");
        }
        System.out.println();
    }
}
