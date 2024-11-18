public class ScopeEx {
    // 프로그램 시작
    public static void main(String[] args) {
        // 변수 선언과 동시에 데이터 저장
        int var1= 1;
        System.out.println(var1);
        if ( true ) {
            int var2;
            var1 = 10;
            var2 = 20;
            System.out.println("if문 안에서 변수 var1="+var1);
            System.out.println("if문 안에서 변수 var2="+var2);
        }
        var1 = 100;
//        var2=200;

        System.out.println("if문 밖에서 변수 var1="+var1);
//        System.out.println("if문 밖에서 변수 var2="+var2);
        for (int i=0; i<1 ; i++) {
            int var3;
            var1 = 1000;
            var3 = 3000;
            System.out.println("for문 안에서 변수 var1 = " + var1);
            System.out.println("for문 안에서 변수 var1 = " + var3);
        }
        var1 = 10000;
//        var3 = 30000;
        System.out.println("for문 밖에서 변수 var1 = " + var1);
//        System.out.println("for문 밖에서 변수 var3 = " + var3);
    }
}
