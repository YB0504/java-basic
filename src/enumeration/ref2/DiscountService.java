package enumeration.ref2;

public class DiscountService {

    // 기존의 if문이 모두 제거된다.
    public int discount(Grade classGrade, int price) {
        return price * classGrade.getDiscountPercent() / 100;
    }
}
