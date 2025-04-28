package exercise.week2;

public class JavaTest8 {
    public static void main(String[] args) {
//        8. 다음 Java 코드를 실행했을 때의 출력 결과를 작성하세요.
        int rows = 5;

        System.out.println("역피라미드");
        for (int i = rows; i >= 1; --i) {
            for (int j = i; j >= 1; --j) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("피라미드");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("트리");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("반대 트리");
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
