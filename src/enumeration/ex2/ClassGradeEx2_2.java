package enumeration.ex2;

public class ClassGradeEx2_2 {
    public static void main(String[] args) {
        int price = 10000;
        DiscountService discountService = new DiscountService();
//        ClassGrade classGrade = new ClassGrade(); // 아예 다른 참조값이 되어버린다.
        // 미연에 방지하기 위해 외부에서 생성할 수 없도록 private 생성자로 막아야한다.
//        int result = discountService.discount(classGrade, price);
//        System.out.println("newClassGrade = " + result);
    }
}
