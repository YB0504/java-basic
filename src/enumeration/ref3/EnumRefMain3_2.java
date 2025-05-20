package enumeration.ref3;

public class EnumRefMain3_2 {
    public static void main(String[] args) {
        // Grade 내부에서 discount()를 만들어 놨기 때문에
        // DiscountService 생성 없이 호출만으로도 가능하다.
        int price = 10000;
        System.out.println("BASIC 등급의 할인 금액: " + Grade.BASIC.discount(price));
        System.out.println("GOLD 등급의 할인 금액: " + Grade.GOLD.discount(price));
        System.out.println("DIAMOND 등급의 할인 금액: " + Grade.DIAMOND.discount(price));
    }
}
