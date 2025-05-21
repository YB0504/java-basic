package time;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class ChangeTimeWithMain {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2018, 1, 1, 13, 30, 59);
        System.out.println("localDateTime = " + localDateTime);

        LocalDateTime changedDt1 = localDateTime.with(ChronoField.YEAR, 2020);
        System.out.println("changedDt1 = " + changedDt1);

        LocalDateTime changedDt2 = localDateTime.withYear(2020);
        System.out.println("changedDt2 = " + changedDt2);
        
        // TemporalAdjuster 사용
        // 다음 주 금요일
        LocalDateTime with1 = localDateTime.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        System.out.println("기준 날짜 = " + localDateTime);
        System.out.println("다음 주 금요일 = " + with1);
        
        // 이번 달의 마지막 일요일
        LocalDateTime with2 = localDateTime.with(TemporalAdjusters.lastInMonth(DayOfWeek.SUNDAY));
        System.out.println("같은 달의 마지막 일요일 = " + with2);
    }
}
