package enumeration.ref3;

public class EnumRefMain3_4 {
    public static void main(String[] args) {
        int price = 10000;
        // 새로운 상수가 추가되도 코드의 변경이 없도록 리팩토링
        Grade[] grades = Grade.values();
        for (Grade grade : grades) {
            printDisount(grade, price);
        }
    }

    private static void printDisount(Grade grade, int price) {
        System.out.println(grade.name() + " 등급의 할인 금액: " + grade.discount(price));
    }
}
