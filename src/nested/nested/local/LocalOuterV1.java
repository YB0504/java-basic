package nested.nested.local;

public class LocalOuterV1 {

    private int outInstanceVar = 3;

    public void process(int paramVar) {

        int lovalVar = 1;

        // 지역 클래스는 지역 변수처럼 접근 제어자를 사용할 수 없다.
        class LocalPrinter {
            int value = 0;

            public void printData() {
                System.out.println("value = " + value); // 자신의 인스턴스 접근 가능
                System.out.println("lovalVar = " + lovalVar);   // 자신이 속한 코드 블럭의 지역변수 접근 가능
                System.out.println("paramVar = " + paramVar);   // 자신이 속한 코드 블럭의 매개변수 접근 가능
                System.out.println("outInstanceVar = " + outInstanceVar);   // 외부 클래스의 인스턴스 멤버 접근 가능
            }
        }

        LocalPrinter localPrinter = new LocalPrinter();
        localPrinter.printData();
    }

    public static void main(String[] args) {
        LocalOuterV1 localOuterV1 = new LocalOuterV1();
        localOuterV1.process(2);
    }
}
