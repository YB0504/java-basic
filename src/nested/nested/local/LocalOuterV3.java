package nested.nested.local;

import java.lang.reflect.Field;

public class LocalOuterV3 {

    private int outInstanceVar = 3;

    public Printer process(int paramVar) {
        int localVar = 1; // 지역 변수

        class LocalPrinter implements Printer {

            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);

                // 인스턴스 변수
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);

                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }

        Printer printer = new LocalPrinter();
        // printer.print()를 여기서 실행 하지 않고 Printer 인스턴스만 반환
        return printer;
    }

    public static void main(String[] args) {
        LocalOuterV3 localOuterV3 = new LocalOuterV3();
        Printer printer = localOuterV3.process(2);
        
        // printer.print()를 process()의 스택 프레임이 사라지고 실행
        printer.print();

        // 추가
        System.out.println("필드 확인");
        Field[] fields = printer.getClass().getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field = " + field);
        }
    }
}
