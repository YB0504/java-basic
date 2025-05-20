package enumeration.ref1;

public class DiscountService {

    // 기존의 if문이 모두 제거된다.
    public int discount(ClassGrade classGrade, int price) {
        return price * classGrade.getDiscountPercent() / 100;
    }
}
