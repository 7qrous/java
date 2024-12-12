package _06_class.example.private_inner_classes;

public class Main {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
//        ERR
//        OuterClass.InnerClass myInner = myOuter.new InnerClass();
//        System.out.println(myInner.y + myOuter.x);
    }
}