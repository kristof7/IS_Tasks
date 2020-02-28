package infoshareacademy;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class TaskD {

    public void exerciseD() {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime endOfCourse = LocalDateTime.of(2020, 7, 26,14,00);
        long days = ChronoUnit.DAYS.between(now, endOfCourse);
        long hours = ChronoUnit.HOURS.between(now, endOfCourse);
        long minutes = ChronoUnit.MINUTES.between(now, endOfCourse);

        System.out.println("Do końca kursu zostało: " + days + " dni, " + hours + " godzin, " + minutes + " minut.");

    }
}
