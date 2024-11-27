package _05_참조타입.예제;

public class StringEqualsEx {
    public static void main(String[] args) {
        String str1 = "자바";
        String str2 = "자바";
        String str3 = new String("자바");
        String str4 = new String("자바");

        if (str1 == str2) {
            System.out.println("str1과 str2는 참조가 같음");
        } else {
            System.out.println("str1과 str2는 참조가 다름");
        }
        System.out.println();
        if (str3 == str4) {
            System.out.println("str3과 str4는 참조가 같음");
        } else {
            System.out.println("str3과 str4는 참조가 다름");
        }
        System.out.println();

        if (str2 == str3) {
            System.out.println("str2과 str3는 참조가 같음");
        } else {
            System.out.println("str2과 str3는 참조가 다름");
        }
        System.out.println();
        System.out.println("str1:" + str1);
        System.out.println("str2:" + str2);
        System.out.println("str3:" + str3);
        System.out.println("str4:" + str4);
    }
}
