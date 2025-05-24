package nested.test;

public class OuterClassMain1 {
    public static void main(String[] args) {
        // 정적 중첩 클래스 사용
        OuterClass1.NestedClass nestedClass = new OuterClass1.NestedClass();
        nestedClass.hello();
    }
}
