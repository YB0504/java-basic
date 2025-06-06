package time;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class GetTimeMain {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2030, 1, 1, 13, 30, 59);
        System.out.println("YEAR = " + localDateTime.get(ChronoField.YEAR));
        System.out.println("MONTH_OF_YEAR = " + localDateTime.get(ChronoField.MONTH_OF_YEAR));
        System.out.println("DAY_OF_MONTH = " + localDateTime.get(ChronoField.DAY_OF_MONTH));
        System.out.println("HOUR_OF_DAY = " + localDateTime.get(ChronoField.HOUR_OF_DAY));
        System.out.println("MINUTE_OF_HOUR = " + localDateTime.get(ChronoField.MINUTE_OF_HOUR));
        System.out.println("SECOND_OF_MINUTE = " + localDateTime.get(ChronoField.SECOND_OF_MINUTE));

        // 위의 get()은 코드가 길어지고 번거롭기 때문에 간단한 편의 메소드를 제공한다.
        System.out.println("\n" + "편의 메소드 사용");
        System.out.println("YEAR = " + localDateTime.getYear());
        System.out.println("MONTH_OF_YEAR = " + localDateTime.getMonthValue());
        System.out.println("DAY_OF_MONTH = " + localDateTime.getDayOfMonth());
        System.out.println("HOUR_OF_DAY = " + localDateTime.getHour());
        System.out.println("MINUTE_OF_HOUR = " + localDateTime.getMinute());
        System.out.println("SECOND_OF_MINUTE = " + localDateTime.getSecond());

        // 자주 사용하지 않으므로 제공하지 않는다.
        System.out.println("\n" + "편의 메소드에 없음");
        System.out.println("MINUTE_OF_DAY = " + localDateTime.get(ChronoField.MINUTE_OF_DAY));
        System.out.println("SECOND_OF_DAY = " + localDateTime.get(ChronoField.SECOND_OF_DAY));
    }
}
