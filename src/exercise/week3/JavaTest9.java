package exercise.week3;

public interface JavaTest9 {
    // 9. 다음과 같이 정의된 인터페이스와 구현 클래스에 대한 올바른 설명을 모두 고르세요.
    //(1) Sprinter, Marathoner 클래스 모두 Runner 인터페이스를 구현하는 클래스이다. x
    //(2) speed 변수의 접근 제어자가 protected이므로, Runner 인터페이스를 구현한 모든 클래스에서 speed 변수를 사용할 수 있다. x
    // - interface 내부에는 public static final로 이루어진 상수와 추상메소드만 존재할 수 있다.
    //(3) Runner 인터페이스를 구현한 모든 클래스는 Runner 인터페이스의 run 메서드를 반드시 구현해야 한다. o
    //(4) Runner 인터페이스를 구현한 모든 클래스는 Runner 인터페이스의 stop 메서드를 반드시 구현해야 한다. x
    // - default 메소드의 구현은 필수적이지 않다.
    //(5) Marathoner 클래스에서 stop 메서드를 호출하면 콘솔 창에 "Stop!"이 출력된다. o
//    protected int speed = 50;

    void run();

    default void stop() {
        System.out.println("Stop");
    }
}

//public class Sprinter extends JavaTest9 {
//    @Override
//    public void run() {
//        System.out.println("Sprinter Running!");
//    }
//}

class Marathoner implements JavaTest9 {
    @Override
    public void run() {
        System.out.println("Marathoner Run!");
    }
}
