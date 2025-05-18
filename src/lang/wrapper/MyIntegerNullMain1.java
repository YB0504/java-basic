package lang.wrapper;

public class MyIntegerNullMain1 {
    public static void main(String[] args) {
        // 객체는 null을 반환할 수 있으므로 값이 없다면 null을 반환하여
        // 명확하게 표현할 수 있다.
        MyInteger[] intArr = {new MyInteger(-1), new MyInteger(0), new MyInteger(1)};
        System.out.println(findValue(intArr, -1));
        System.out.println(findValue(intArr, 0));
        System.out.println(findValue(intArr, 1));
        System.out.println(findValue(intArr, 100));
    }

    private static MyInteger findValue(MyInteger[] intArr, int target) {
        for (MyInteger value : intArr) {
            if (value.getValue() == target) {
                return value;
            }
        }
        return null;
    }
}
