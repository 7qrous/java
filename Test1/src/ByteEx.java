public class ByteEx {
    public static void main(String[] args) {
        // byte type 숫자 하나를 표현 시 1byte를 사용
        // -128 ~ 127 까지의 숫자를 저장하는 데이터 타입
        byte var1 = -128;
        byte var2 = -30;
        byte var3 = 0;
        byte var4 = 30;
        byte var5 = 127;
        
        // 128은 byte타입이 저장할 수 있는 데이터의 범위를 넘어감
//        byte var6 = 128;


        System.out.println("var1 = " + var1);
        System.out.println("var2 = " + var2);
        System.out.println("var3 = " + var3);
        System.out.println("var3 = " + var4);
        System.out.println("var5 = " + var5);
        System.out.println();

        byte value1 = 125;
        int value2 = 125;
        
        
        // 반복문 for 사용
        // 기본 타입 변수가 가질 수 있는 최소값 혹은 최대값을 넘어가는 연산을 진행하면 반대값이 나옴
        for ( int i=0; i<5; i++){
            value1++; // 변수 value1의 값 1증가 ( overflow )
            value2++; // 변수 value2의 값 1증가
            System.out.println("value1 = " + value1 + ", value2 = " + value2);
        }
    }
}