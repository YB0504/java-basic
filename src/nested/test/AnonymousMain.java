package nested.test;

public class AnonymousMain {
    public static void main(String[] args) {
        // 익명 클래스
        Hello hello = new Hello() {
            @Override
            public void hello() {
                System.out.println("AnonymousMain.hello");
            }
        };

        hello.hello();
    }
}
