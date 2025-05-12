package lang.string.test;

public class TestString6 {
    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";

        int count = 0;
        int index = str.indexOf(key);
        // 0 보다 크거나 같은 이유
        // indexOf()는 찾지 못하면 -1 을 반환한다.
        // 더 이상 찾지 못할 때까지 루프
        while (index >= 0) {
            index = str.indexOf(key, index + 1);
            count++;
        }
        System.out.println("count = " + count);
    }
}
