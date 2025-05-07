package static2;

public class DataCountMain3 {
    public static void main(String[] args) {
        // 멤버 메소드의 종류
        // 인스턴스 메소드: static 키워드가 붙지 않은 멤버 메소드
        // 클래스 메소드: static 키워드가 붙은 멤버 메소드
        // ex) 클래스 메소드, 정적 메소드, static 메소드 등으로 불린다.
        // 인스턴스 메소드는 인스턴스를 생성해야 사용할 수 있고 인스턴스에 소속되어 있다.
        // static 키워드가 붙은 메소드는 인스턴스와 무관하게 클래스에 바로 접근하여
        // 사용할 수 있고 클래스 자체에 소속되어 있다.
        
        // 정적 메소드 활용
        // 객체 생성이 필요 없다.
        // 간단한 메소드 하나로 유틸성 메소드에 주로 사용한다.
        
        // 인스턴스를 통한 접근
        // 클래스 메소드는 이런 방식으로 사용하면 안된다.
        DecoData data = new DecoData();
        data.staticCall();

        // 클래스를 통한 접근
        DecoData.staticCall();
    }
}
