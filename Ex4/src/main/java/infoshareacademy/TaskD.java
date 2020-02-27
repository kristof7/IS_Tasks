package infoshareacademy;

import java.time.Duration;
import java.time.LocalDateTime;

public class TaskD {

    public void taskDMethod() {

        LocalDateTime localDateTime = LocalDateTime.of(2020, 7, 26, 14, 0);
        LocalDateTime now = LocalDateTime.now();

        Duration diff = Duration.between(now,localDateTime);

       System.out.println("Do konca kursu: "+diff.toDaysPart()+" dni, "+diff.toHoursPart()+" godzin, "+diff.toMinutesPart()+" minut");
    }
}
