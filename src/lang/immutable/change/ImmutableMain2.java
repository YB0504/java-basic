package lang.immutable.change;

public class ImmutableMain2 {
    public static void main(String[] args) {
        ImmutableObj obj1 = new ImmutableObj(10);
        obj1.add(20); // 반환 받을 객체를 생성하지 않았으므로 obj1의 값이 바뀌지 않는다.

        System.out.println("obj1: " + obj1.getValue());
    }
}
