package _05_reference_type.example;

/**
 * 2024-12-02
 * 인덱스를 사용하지 않지만 배열의 모든 내용을 출력. 일반 for문에서는 초기화 변수를 i=0, j=0.. 사용하고 index를 증감, 조건식 반복을 함.
 * ( 참고: 인덱스는 없는데 데이터를 여러개 저장할 수 있는 것도 있음, 일반 for문으로 출력 안될 때 향상된 for문을 통해 출력함)
 * 맨앞에 for는 같고 괄호 안에 타입 변수:배열명을 적고 중괄호를 적고 중괄호 안에 실행문을 입력한다.
 */
public class AdvancedForEx {
    public static void main(String[] args) {
        int scores[] = {95, 71, 84, 93, 87};
        int total = 0;
        System.out.println("---- 일반 for문으로 모든 내용 출력");
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
            total += scores[i];
        }
        System.out.println("일반 for문 total:" + total);
        total = 0;
        System.out.println("\n---- 향상된 for문으로 모든 내용 출력");
        /*
         * 향상된 for문은 index 없이 배열( 컬렉션) 에서 순서대로 데이터를 하나씩 출력하여 지정한 변수에 저장한 후 코드 블록 내에서 사용할 수 있음
         * 일반 for문은 index가 필요
         * */
        for (int score : scores) {
            System.out.println(score);
            total += score;
        }
        System.out.println("향상된 for문 total:" + total);
    }
}
