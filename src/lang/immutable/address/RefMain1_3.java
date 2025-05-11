package lang.immutable.address;

public class RefMain1_3 {
    public static void main(String[] args) {
        Address a = new Address("서울");
        Address b = a;
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        // 이렇게 메소드를 사용하는 경우에는 일일이 찾지 않는 이상
        // 사이드 이펙트를 미리 알기 어렵다.
        change(b, "부산");
        System.out.println("부산 -> b");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }

    private static void change(Address address, String changeAddress) {
        System.out.println("주소 값 변경: " + changeAddress);
        address.setValue(changeAddress);
    }
}
