package static2;

public class DecoDataMain {
    public static void main(String[] args) {
        // 정적 메소드가 인스턴스의 기능을 사용할 수 없는 이유
        // 1. 정적 메소드는 클래스의 이름을 통해 바로 호출할 수 있다.
        // 2. 정적은 인스턴스처럼 참조값의 개념이 없다.
        // !! 정적 메소드도 매개변수로 객체의 참조값을 전달하면
        //    인스턴스의 변수나 메소드를 호출할 수 있다.
        System.out.println("1. 정적 호출");
        DecoData.staticCall();

        System.out.println("2. 인스턴스 호출1");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("3. 인스턴스 호출2");
        DecoData data2 = new DecoData();
        data2.instanceCall();
    }
}
