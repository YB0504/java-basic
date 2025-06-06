package lang.immutable.address;

public class RefMain2 {
    public static void main(String[] args) {
        ImmutableAddress a = new ImmutableAddress("서울");
        ImmutableAddress b = a;
        System.out.println("a: " + a);
        System.out.println("b: " + b);

//        b.setValue("부산"); // 불변 객체 사용으로 인한 컴파일 에러
        b = new ImmutableAddress("부산");
        System.out.println("부산 -> b");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}
