package lang.wrapper;

public class MyIntegerMethodMain1 {
    public static void main(String[] args) {
        MyInteger integer = new MyInteger(10);
        // 자기 자신의 값을 외부의 값과 비교한다.
        int i1 = integer.compareTo(5);
        int i2 = integer.compareTo(10);
        int i3 = integer.compareTo(20);

        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);
        System.out.println("i3 = " + i3);
    }
}
