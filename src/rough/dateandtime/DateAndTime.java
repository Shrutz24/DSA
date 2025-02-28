package rough.dateandtime;

import java.time.*;
import java.util.Set;

public class DateAndTime {
    public static void main(String[] args) {
        java.time.LocalDate now = java.time.LocalDate.now();
        System.out.println(now);
        java.time.LocalDate customDate = java.time.LocalDate.from(LocalDateTime.of(1998,04,24,6,24));
        int dayOfMonth = now.getDayOfMonth();
        DayOfWeek dayOfWeek = now.getDayOfWeek();
        Month month = now.getMonth();
        int year = now.getYear();

        System.out.println(dayOfMonth);
        System.out.println(dayOfWeek);
        System.out.println(month);
        System.out.println(year);

        LocalTime current = LocalTime.now();
        System.out.println(current);
        LocalTime customTime = LocalTime.of(14,25);
        System.out.println(customTime);
        System.out.println(current.minusHours(2));

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        System.out.println("----------------------------------------------------------------");
        availableZoneIds.forEach(zone-> System.out.println(zone));

    }

}
