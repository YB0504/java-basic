package exercise.week2;

public class JavaTest7 {
    public static void main(String[] args) {
        //7. 다음 Java 코드를 실행했을 때의 출력 결과를 작성하세요.
        int i = 0;

        while (true) {
            if (i == 10) {
                break;
            }
            if (i % 3 == 0) {
                i++;
                continue;
            }

            // 1,2,4,5,7,8
            // if 문에 해당하지 않는 숫자가 출력되고 ++된다.
            System.out.println(i);
            i++;
        }
    }
}
