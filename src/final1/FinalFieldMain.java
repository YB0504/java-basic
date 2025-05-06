package final1;

public class FinalFieldMain {
    public static void main(String[] args) {
        // final 필드 - 생성자 초기화
        // 생성자를 사용하여 final 필드를 초기화하는 경우
        // 각 인스턴스마다 final 필드에 다른 값을 할당할 수 있다.
        System.out.println("생성자 초기화");
        ConstructInit constructInit1 = new ConstructInit(10);
        ConstructInit constructInit2 = new ConstructInit(20);
        System.out.println(constructInit1.value);
        System.out.println(constructInit2.value);

        // final 필드 - 필드 초기화
        // final 필드를 필드에서 초기화할 경우
        // 모든 인스턴스가 같은 값을 가지게 된다.
        System.out.println("필드 초기화");
        FieldInit fieldInit1 = new FieldInit();
        FieldInit fieldInit2 = new FieldInit();
        FieldInit fieldInit3 = new FieldInit();
        System.out.println(fieldInit1.value);
        System.out.println(fieldInit2.value);
        System.out.println(fieldInit3.value);

        // 상수
        // 위처럼 final 필드를 사용하는 경우 명백하게 중복되기 때문에
        // static 키워드를 함께 사용하여 상수로 만들어 사용한다.
        // static 영역은 단 하나만 존재하는 영역이므로 JVM 상에 하나만 존재한다.
        // 중복과 메모리 비효율 문제를 모두 해결할 수 있다.
        // 이러한 이유로 final + 필드 초기화를 사용하는 경우
        // static 키워드를 함께 사용하는 것이 효과적이다.
        System.out.println("상수");
        System.out.println(FieldInit.CONST_VALUE);
    }
}
