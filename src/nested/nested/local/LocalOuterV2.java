package nested.nested.local;

public class LocalOuterV2 {

    private int outInstanceVar = 3;

    public void process(int paramVar) {

        int lovalVar = 1;

        // 지역 클래스는 지역 변수처럼 접근 제어자를 사용할 수 없다.
        class LocalPrinter implements Printer{
            int value = 0;

            // Printer 인터페이스의 구현
            @Override
            public void print() {
                System.out.println("value = " + value); // 자신의 인스턴스 접근 가능
                System.out.println("lovalVar = " + lovalVar);   // 자신이 속한 코드 블럭의 지역변수 접근 가능
                System.out.println("paramVar = " + paramVar);   // 자신이 속한 코드 블럭의 매개변수 접근 가능
                System.out.println("outInstanceVar = " + outInstanceVar);   // 외부 클래스의 인스턴스 멤버 접근 가능
            }
        }

        Printer printer = new LocalPrinter();
        printer.print();
    }

    public static void main(String[] args) {
        LocalOuterV2 localOuterV2 = new LocalOuterV2();
        localOuterV2.process(2);
    }
}
