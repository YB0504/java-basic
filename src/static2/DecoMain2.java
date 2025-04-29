package static2;

public class DecoMain2 {
    public static void main(String[] args) {
        String s = "hello java";
        String deco = DecoUtil2.deco(s); // 정적 메소드 사용

        System.out.println("before: " + s);
        System.out.println("after: " + deco);
    }
}
