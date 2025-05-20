package enumeration.ref2;

public enum Grade {
    BASIC(10), GOLD(20), DIAMOND(30);

    private final int discountPercent;

    // 열거형은 상수로 지정하는 것외에 일반적인 방법으로 생성이 불가능
    // 생성자에 접근제어자를 선언할 수 없게 막혀있다(private과 같다고 생각하면 된다.)
    Grade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }
}
