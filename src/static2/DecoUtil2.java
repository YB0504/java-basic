package static2;

public class DecoUtil2 {

    // static 변수는 정적 변수처럼 인스턴스 생성 없이
    // 클래스 명을 통해 바로 호출하여 사용할 수 있다.
    public static String deco(String str) {
        String result = "*" + str + "*";
        return result;
    }
}
