package lang.object.toString;

public class ToStringMain1 {
    public static void main(String[] args) {
        Object object = new Object();
        String string = object.toString();
        
        // toString() 반환값 출력
        System.out.println(string);
        
        // object 직접 출력
        System.out.println(object);

        // println()은 내부적으로 toString()을 호출하므로
        // println()을 사용한다면 toString()을 추가로 호출할 필요가 없다.
    }
}
