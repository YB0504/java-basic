package lang.immutable.address;

public class RefMain1_2 {
    public static void main(String[] args) {
        // 사이드 이펙트 해결방안
        Address a = new Address("서울");
        Address b = new Address("서울");
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        b.setValue("부산"); // b의 값을 부산으로
        System.out.println("부산 -> b");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}
