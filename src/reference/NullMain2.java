package reference;

public class NullMain2 {
    public static void main(String[] args) {
        // NullPointerException은 이름 그대로 null을 가리킬 때(Pointer) 생기는 예외이다.
        // 찾아갈 주소 값이 없을 때
        Data data = null;
        data.value = 10; // NullPointerException (null.value 상태)
        System.out.println("data = " + data.value);
    }
}
