package _02_var_type;

public class ScopeEx {
    // 프로그램 시작
    public static void main(String[] args) {
        // 변수 선언과 동시에 데이터 저장
        // main method 전체에서 다 사용 가능한 var1

        int var1= 1;// 변수선언 var1=1
        System.out.println(var1);//출력 var1 : 1

        // if 문 사용, if 문 중괄호 시작
        if ( true ) {
            // 변수 var2 선언, if문 안에서 선언
            int var2; // if문 내에서 사용가능한 var2변수
            var1 = 10; //변수 var1번에 데이터 저장
            var2 = 20; //변수 var2번에 데이터 저장
            
            //저장한 데이터 출력
            System.out.println("if문 안에서 변수 var1="+var1); 
            System.out.println("if문 안에서 변수 var2="+var2);
        }
        // if문 중괄호 끝, 실행완료

        var1 = 100; //if문 밖에서 var1에 100 데이터 값을 저장
//        var2=200; //if문 밖에서 if 문안에 선언한 var2번에 데이터 저장실패
                    //if문 안에서 선언한 변수는 if문 코드블럭을 벗어나면 메모리에서 삭제 됨


//      if문 밖에서 변수 var1을 사용
        System.out.println("if문 밖에서 변수 var1="+var1);

//      if문 밖에서 변수 var2을 사용, 오류 발생, 이미 메모리에서 삭제되어 존재하지 않는 변수를 사용
//        System.out.println("if문 밖에서 변수 var2="+var2);
        
        // for문 선언, 코드블럭 중괄호 시작
        for ( int i = 0; i < 1 ; i++ ) {

            //변수 for문 안에서 int var3 변수선언
            int var3;

            // for문 안에서 var1에 1000값 저장
            var1 = 1000;

            // for문 안에서 var3에 3000값 저장
            var3 = 3000;

            // for문 안에서 변수 var1에 저장된 데이터 출력
            System.out.println("for문 안에서 변수 var1 = " + var1);
            // for문 안에서 변수 var3에 저장된 데이터 출력
            System.out.println("for문 안에서 변수 var3 = " + var3);
        }
        // for문 끝, 중괄호 끝

//      for문 밖에서 변수 var1에 데이터 저장
        var1 = 10000;

//      for문 밖에서 변수 var3에 데이터 저장 실패, 오류 발생, for문 실행 완료되어 메모리상에서 삭제됨
//        var3 = 30000;

//       변수 var1에 저장된 내용 출력
        System.out.println("for문 밖에서 변수 var1 = " + var1);
//        System.out.println("for문 밖에서 변수 var3 = " + var3);
    }
}

// 변수 scope : 변수가 메모리상에 살아 있는 범위