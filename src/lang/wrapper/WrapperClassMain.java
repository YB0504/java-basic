package lang.wrapper;

public class WrapperClassMain {
    public static void main(String[] args) {
        // Boxing
        Integer newInter = new Integer(10); // 삭제 예정 value.of() 사용 요망
        Integer integerObj = Integer.valueOf(10); // -128 ~ 127 자주 사용하는 숫자값 재사용, 불변
        Long longObj = Long.valueOf(100);
        Double doubleObj = Double.valueOf(10.5);

        System.out.println("newInter = " + newInter);
        System.out.println("integerObj = " + integerObj);
        System.out.println("longObj = " + longObj);
        System.out.println("doubleObj = " + doubleObj);

        System.out.println("내부 값 읽기");
        // Unboxing
        int intValue = integerObj.intValue();
        System.out.println("intValue = " + intValue);
        long longValue = longObj.longValue();
        System.out.println("longValue = " + longValue);

        System.out.println("비교");
        System.out.println("==: " + (newInter == integerObj));
        System.out.println("equals: " + newInter.equals(integerObj));
    }
}
