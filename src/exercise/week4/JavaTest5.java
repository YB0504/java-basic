package exercise.week4;

public class JavaTest5 {
    public static void main(String[] args) {
        // 1, 3, 5, 6
        try {
            try {
                System.out.println(1);
                int[] array = new int[3];
                System.out.println(array[3]); // 예외 발생 초기화 안된 배열(값이 없음)
                System.out.println(2);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(3);
                throw new Exception(e); // 예외 던지기
            }
            System.out.println(4);
        } catch (Throwable e) { // 예외 받기
            System.out.println(5);
            throw new RuntimeException(e);
        } finally {
            System.out.println(6); // finally는 무조건 실행
        }
        System.out.println(7);
    }
}
