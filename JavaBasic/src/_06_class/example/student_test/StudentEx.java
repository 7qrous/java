package _06_class.example.student_test;

public class StudentEx {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("s1 변수가 Student객체를 참조합니다.");
        Student s2 = new Student();
        System.out.println("s2 변수가 Student객체를 참조합니다.");
        Student s3;
        s3 = new Student();
        System.out.println("s3 변수가 Student객체를 참조합니다.");
    }
}
