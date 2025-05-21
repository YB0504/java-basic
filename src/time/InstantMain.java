package time;

import java.time.Instant;
import java.time.ZonedDateTime;

public class InstantMain {
    public static void main(String[] args) {
        // 생성
        Instant now = Instant.now(); // UTC 기준
        System.out.println("now = " + now);

        ZonedDateTime zdt = ZonedDateTime.now();
        // from(): 다른 타입의 날짜와 시간을 기준으로 Instant를 생성
        // Instant는 UTC를 기준으로 하기 때문에 시간대 정보가 필요하다.
        // 따라서 LocalDateTime 클래스는 사용할 수 없다.
        Instant from = Instant.from(zdt);
        System.out.println("from = " + from);

        // ofEpochSecond(): 에포크 시간을 기준으로 Instant를 생성
        // 0초를 선택하면 에포크 시간인 1970년 1월 1일 0시 0분 0초로 생성된다.
        Instant epochStart = Instant.ofEpochSecond(0);
        System.out.println("epochStart = " + epochStart);

        // 계산
        // plusSeconds(): 초를 더한다. 초, 밀리초, 나노초 정도만 더하는 간단한 메소드를 제공
        Instant later = epochStart.plusSeconds(3600);
        System.out.println("later = " + later);

        // 조회
        // getEpochSecond(): 에포크 시간을 기준으로 흐른 초를 반환한다.
        long laterEpochSecond = later.getEpochSecond();
        System.out.println("laterEpochSecond = " + laterEpochSecond);
    }
}
