package infoshareacademy;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class TaskD {

    public void timeToInfoShareCourseEnds() {
        LocalDateTime end = LocalDateTime.of(2020, 7, 26, 14, 00);
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime temporaryDate = LocalDateTime.from(now);

        long years = temporaryDate.until(end, ChronoUnit.YEARS);
        temporaryDate = temporaryDate.plusYears(years);

        long months = temporaryDate.until(end, ChronoUnit.MONTHS);
        temporaryDate = temporaryDate.plusMonths(months);

        long days = temporaryDate.until(end, ChronoUnit.DAYS);
        temporaryDate = temporaryDate.plusDays(days);

        long hours = temporaryDate.until(end, ChronoUnit.HOURS);
        temporaryDate = temporaryDate.plusHours(hours);

        long minutes = temporaryDate.until(end, ChronoUnit.MINUTES);

        System.out.printf("To the end of course left:" + " %s years, %s months, %s days, " +
                        "%s hours, %s minutes",
                years, months, days, hours, minutes);

    }
}
