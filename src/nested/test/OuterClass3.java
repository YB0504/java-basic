package nested.test;

public class OuterClass3 {

    public void MyMethod() {
        // 지역 클래스
        class LocalClass {
            public void hello() {
                System.out.println("LocalClass.hello");
            }
        }

        LocalClass localClass = new LocalClass();
        localClass.hello();
    }
}
