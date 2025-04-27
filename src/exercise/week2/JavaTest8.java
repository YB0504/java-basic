package exercise.week2;

public class JavaTest8 {
    public static void main(String[] args) {
//        8. 다음 Java 코드를 실행했을 때의 출력 결과를 작성하세요.
        int rows = 5;

        for (int i = rows; i >= 1; --i) {
            for (int j = i; j >= 1; --j) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
