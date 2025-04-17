package oop1;

public class MusicPlayerMain3 {
    public static void main(String[] args) {
        // 절차지향 프로그래밍의 한계
        // 데이터와 기능이 분리되어 있다.
        // 그래서 데이터나 메소드를 유지보수 해야한다면
        // 두 곳 모두 수정해야 한다.
        MusicPlayerData data = new MusicPlayerData();
        
        // 플레이어 켜기
        on(data);

        // 볼륨 증가
        up(data);

        // 볼륨 증가
        up(data);

        // 볼륨 감소
        down(data);

        // 플레이어 상태
        status(data);

        // 플레이어 끄기
        off(data);
        System.out.println("음악 플레이어 OFF");
    }

    static void on(MusicPlayerData data) {
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다");
    }

    static void off(MusicPlayerData data) {
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다");
    }

    static void up(MusicPlayerData data) {
        data.volume++;
        System.out.println("음악 플레이어 볼륨: " + data.volume);
    }

    static void down(MusicPlayerData data) {
        data.volume--;
        System.out.println("음악 플레이어 볼륨: " + data.volume);
    }

    static void status(MusicPlayerData data) {
        System.out.println("음악 플레이어 상태 확인");
        if (data.isOn) {
            System.out.println("음악 플레이어 상태 ON, 볼륨: " + data.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
}
