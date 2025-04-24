package memory;

public class JavaMemoryMain1 {
    public static void main(String[] args) {
        // 처음 자바를 실행하면 main()을 실행한다.
        // 이때 main()을 위한 스택 프레임이 하나 생성된다.
        // main()이 종료되면 자바는 프로그램을 정리하고 종료한다.
        System.out.println("main start");
        method1(10);
        System.out.println("main end");
    }

    static void method1(int m1) {
        // main()은 method1()을 호출한다.
        // method1 스택 프레임 생성
        System.out.println("method1 start");
        int cal = m1 * 2;
        method2(cal);
        System.out.println("method1 end");
    }

    static void method2(int m2) {
        // method1()은 method2()을 호출한다.
        // method2 스택 프레임 생성
        // 종료되면서 스택을 빠져나가면서 스택 프레임이 역순으로 제거된다.
        System.out.println("method2 start");
        System.out.println("method2 end");
    }
}
