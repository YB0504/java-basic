package nested.test;

public class OuterClassMain2 {
    public static void main(String[] args) {
        // 내부 클래스 사용
        OuterClass2 outerClass2 = new OuterClass2();
        OuterClass2.InnerClass innerClass = outerClass2.new InnerClass();
        innerClass.hello();
    }
}
