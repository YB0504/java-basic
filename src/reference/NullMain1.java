package reference;

public class NullMain1 {
    public static void main(String[] args) {
        // 참조형 변수가 아직 가리키는 대상이 없다면 null을 넣어둘 수 있다.
        Data data = null;
        System.out.println("1. data = " + data);
        data = new Data(); // 참조값이 생긴다.
        System.out.println("2. data = " + data);
        // 참조하는 곳이 없는 인스턴스는 JVM의 GC(가비지 콜렉션)이
        // 해당 인스턴스를 메모리에서 지워버린다.
        data = null;
        System.out.println("3. data = " + data);
    }
}
