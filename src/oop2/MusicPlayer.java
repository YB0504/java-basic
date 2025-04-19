package oop2;

public class MusicPlayer {
    // 이렇게 속성과 기능을 하나로 묶어서
    // 필요한 기능을 메소드를 통해 외부에 제공하는 것을 캡슐화라고 한다.
    // 객체지향프로그래밍에서는 객체, 즉 속성(변수)와 기능(메소드)를
    // 얼마나 잘 만드느냐를 더 중요시한다.
    int volume = 0;
    boolean isOn = false;

    void on() {
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다");
    }

    void off() {
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다");
    }

    void volumeUp() {
        volume++;
        System.out.println("볼륨: " + volume);
    }

    void volumeDown() {
        volume--;
        System.out.println("볼륨: " + volume);
    }

    void showStatus() {
        System.out.println("음악 플레이어 상태");
        if (isOn) {
            System.out.println("음악 플레이어 On, 볼륨: " + volume);
        } else {
            System.out.println("음악 플레이어 Off");
        }
    }
}
