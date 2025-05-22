package nested.inner;

public class InnerOuterMain {
    public static void main(String[] args) {
        InnerOuter outer = new InnerOuter();
        // 내부 클래스는 외부클래스의 인스턴스 참조.new 내부클래스()로 생성할 수 있다.
        // 외부클래스의 인스턴스 참조.new 내부클래스()로 생성한 내부 클래스는 개념상 외부 클래스의 인스턴스 내부에 생성된다.
        // 따라서 바깥 클래스의 인스턴스를 먼저 생성해야 내부 클래스의 인스턴스를 생성할 수 있다.
        InnerOuter.Inner inner = outer.new Inner();
        inner.print();

        System.out.println("inner.getClass = " + inner.getClass());
    }
}
