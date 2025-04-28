package exercise.week4;

public class JavaTest4 {
    public static void main(String[] args) {
        //4. 다음 코드를 실행했을 때 출력되는 결과를 작성하세요.
        //- 1, 4
        System.out.println(1);
        try {
            System.out.println(0 / 0); // 예외 발생 ArithmeticException
            System.out.println(2);
        } catch (Exception e) {
            System.out.println(4);
        }
    }
}
