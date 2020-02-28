package infoshareacademy.zad_4;

import java.time.Duration;
import java.time.LocalDateTime;


public class CalendarClass {


    public static void timeCounter() {

        LocalDateTime endOfCourseDate = LocalDateTime.of(2020, 07, 26, 14, 00);
        LocalDateTime today = LocalDateTime.now();
        Duration duration = Duration.between(today, endOfCourseDate);

        int days = (int) (duration.toDays());
        int hours = (int) (duration.toHours() - 24 * days);
        int minutes = (int) (duration.toMinutes() - 24 * 60 * days - 60 * hours);
        System.out.println("Do końca kursu zostało: " + days + " dni " + hours + " godzin " + minutes + " minut.");

    }

}
