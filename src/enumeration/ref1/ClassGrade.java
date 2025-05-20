package enumeration.ref1;

public class ClassGrade {

    // 회원의 등급에 따라 할인율이 정해져 있기 때문에 상수 선언과 함께 값을 설정
    public static final ClassGrade BASIC = new ClassGrade(10);
    public static final ClassGrade GOLD = new ClassGrade(20);
    public static final ClassGrade DIAMOND = new ClassGrade(30);

    // 생성자를 통해서만 값이 설정되도록 변경
    private final int discountPercent;

    public ClassGrade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }
}
