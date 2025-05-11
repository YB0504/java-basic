package lang.immutable.address;

public class PrimitiveMain {
    public static void main(String[] args) {
        // 기본형은 절대로 같은 값을 공유하지 않는다.
        int a = 10;
        int b = a; // a의 값을 복사하여 b에 대입
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        // a의 10과 b의 10은 서로 완전히 다른 10이다.
        // 메모리 상에서도 각각 따로 존재한다.

        b = 20;
        System.out.println("b: " + b);
    }
}
