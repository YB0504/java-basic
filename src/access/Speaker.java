package access;

public class Speaker {
    // 필드에 직접 접근할 수 없도록 private 접근제어자를 붙여준다.
    // private 접근제어자
    // 같은 클래스 내에서만 사용할 수 있다.
    // 모든 외부 호출을 막는다.
    private int volume;
    
    // Java의 접근제어자 4종류
    // private: 모든 외부 호출을 막는다.(클래스 안으로 속성과 기능을 숨길 때 사용)
    // default: 같은 패키지 안에서의 호출을 허용한다.(패키지 안으로 속성과 기능을 숨길 때 사용)
    // protected: 같은 패키지 내부와 상속관계의 호출을 허용한다.(상속 관계로 속성과 기능을 숨길 때 사용)
    // public: 모든 외부 호출을 허용한다.
    // 순서대로 가장 많이 차단하고 가장 많이 허용하는 접근제어자
    // 지역 변수에는 접근제어자를 사용할 수 없다.

    Speaker(int volume) {
        this.volume = volume;
    }

    void volumeUp() {
        if (volume >= 100) {
            System.out.println("최대 음량");
        } else {
            volume += 10;
            System.out.println("볼륨 10 증가");
        } 
    }

    void volumeDown() {
        volume -= 10;
        System.out.println("볼륨 10 감소");
    }

    void showVolume() {
        System.out.println("현재음량: " + volume);
    }
}
