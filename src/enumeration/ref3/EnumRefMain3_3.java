package enumeration.ref3;

public class EnumRefMain3_3 {
    public static void main(String[] args) {
        // 출력 중복 제거
        int price = 10000;
        printDiscount(Grade.BASIC, price);
        printDiscount(Grade.GOLD, price);
        printDiscount(Grade.DIAMOND, price);
    }

    // Enum의 name()을 이용하여 상수 이름을 직접 사용
    private static void printDiscount(Grade grade, int price) {
        System.out.println(grade.name() + " 등급의 할인 금액: " + grade.discount(price));
    }
}
