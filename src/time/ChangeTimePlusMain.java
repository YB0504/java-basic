package time;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class ChangeTimePlusMain {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2018, 1, 1, 13, 30, 59);
        System.out.println("localDateTime = " + localDateTime);

        // 원형 메소드
        LocalDateTime plusDt1 = localDateTime.plus(10, ChronoUnit.YEARS);
        System.out.println("plusDt1 = " + plusDt1);

        // 편의 메소드
        LocalDateTime plusDt2 = localDateTime.plusYears(10);
        System.out.println("plusDt2 = " + plusDt2);

        Period period = Period.ofYears(10);
        LocalDateTime plusDt3 = localDateTime.plus(period);
        System.out.println("plusDt3 = " + plusDt3);
    }
}
