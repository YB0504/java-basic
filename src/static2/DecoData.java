package static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {
//        instanceValue++;  // 인스턴스 변수 접근, compile error
//        instanceMethod(); // 인스턴스 메소드 접근, compile error

        // 정적 메소드에서는 정적 변수와, 정적 메소드에만 접근할 수 있다.
        staticValue++;
        staticMethod();
    }

    public void instanceCall() {
        // 인스턴스 메소드 에서는 인스턴스, 정적 변수 메소드 모두 접근할 수 있다.
        instanceValue++;    // 인스턴스 변수 접근
        instanceMethod();   // 인스턴스 메소드 접근

        staticValue++;      // 정적 변수 접근
        staticMethod();     // 정적 메소드 접근
    }

    private static void staticMethod() {
        System.out.println("staticValue: " + staticValue);
    }

    private void instanceMethod() {
        System.out.println("instanceValue: " + instanceValue);
    }
}
