package reference;

public class MethodChange1 {

    static void changePrimitive(int x) {
        // x의 값만 20으로 대입한 것이다.
        x = 20;
    }

    public static void main(String[] args) {
        int a = 10;
        System.out.println("메소드 호출 전: a = " + a);
        // int x = a;
        // 10이 복사된 a를 x에 복사하여 전달하는 것이므로 20이아닌 10이 나온다.
        changePrimitive(a);
        System.out.println("메소드 호출 후: a = " + a);
    }
}
