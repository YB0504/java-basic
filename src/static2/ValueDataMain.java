package static2;

import oop1.ValueData;

public class ValueDataMain {
    // main() 는 정적 메소드!!
    // 정적 메소드는 정적 메소드만 호출할 수 있다.
    // 정적 메소드인 main() 에서는 정적 메소드만 호출할 수 있다.
    public static void main(String[] args) {
        ValueData data = new ValueData();
        add(data);
    }

    static void add(ValueData valueData) {
        valueData.value++;
        System.out.println("숫자 증가 value = " + valueData.value);
    }
}
