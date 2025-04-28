package exercise.week1;

public class VariableTest {
    public static void main(String[] args) {
        // 변수 명명 규칙
        // 1. 대소문자를 구분한다.
        // 2. 숫자를 포함할 수 있다.
        // 3. 특수문자는 _, $만 사용 가능하다.
        // 4. 예약어는 사용할 수 없다.
        // 5. 길이의 제한이 없다.

//        byte b = 128; // byte는 127까지 초기화 가능하다.
//        char c = 'ab'; // char는 한글자
//        int x = 10.7; // int는 정수형
//        long l = 10;
//        double d = 3.14f;
//        boolean bool = true;

        // variable 1
//        int x;
//        System.out.println(x);
        // 초기화 되지 않았기 때문에 컴파일 에러
        // 자바는 초기화 되지 않은 지역변수는 사용할 수 없다.

        // variable 2
        double a = 10.5;
        int b = (int) a;
        System.out.println(b); // 10

        float c = 1.0f;
        double d = 1.0;
        System.out.println(c == d); // true
    }
}
