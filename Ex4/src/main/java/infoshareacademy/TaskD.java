package infoshareacademy;

import java.time.Duration;
import java.time.LocalDateTime;

public class TaskD {
    public static void main(String[] args) {
        timeToEndOfCourse();
    }
    public static void timeToEndOfCourse() {
        LocalDateTime definedDate = LocalDateTime.of(2020, 07, 26, 14, 00);
        LocalDateTime today = LocalDateTime.now();
        Duration duration = Duration.between(today, definedDate);
        System.out.println("Do końca kursu pozostało: " + duration.toDaysPart() + " dni " + duration.toHoursPart()
                + " godzin " + duration.toMinutesPart() + " minut.");
    }
}
