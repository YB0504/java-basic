package enumeration.ex3;

public class DiscountService {

    public int discount(Grade grade, int price) {
        int discountPercent = 0;

        // 매개변수로 넘어오는 인수도 ClassGrade 가 가진 상수 중에 하나를 사용한다.
        // 따라서 열거한 상수의 참조값으로 "=="를 사용하여 비교한다.
        if (grade == Grade.BASIC) {
            discountPercent = 10;
        } else if (grade == Grade.GOLD) {
            discountPercent = 20;
        } else if (grade == Grade.DIAMOND) {
            discountPercent = 30;
        } else {
            System.out.println("할인 X");
        }

        return price * discountPercent / 100;
    }
}
