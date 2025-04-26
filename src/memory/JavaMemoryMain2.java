package memory;

public class JavaMemoryMain2 {
    public static void main(String[] args) {
        System.out.println("main start");

        method1();

        System.out.println("main end");
    }

    static void method1() {
        System.out.println("method1 start");
        Data data1 = new Data(10);
        method2(data1);
        // method1이 종료되면서 더 이상 Data인스턴스를 참조하는 곳이 없다.
        // 참조되는 곳이 없으므로 사용되는 곳도 없다.
        // 이때 가비지 컬렉션에서 참조가 모두 사라진 인스턴스를 찾아서
        // 메모리에서 제거한다.
        System.out.println("method1 end");
    }

    static void method2(Data data2) {
        System.out.println("method2 start");
        System.out.println("data.value: " + data2.getValue());
        System.out.println("method2 end");
    }

}
