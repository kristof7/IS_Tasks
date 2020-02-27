package infoshareacademy;

import java.time.Duration;
import java.time.LocalDateTime;

public class TaskD {

    public static void printRemainCourseEndTime(){
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime endOfCourse = LocalDateTime.of(2020,7,26,14,0);
        Duration duration = Duration.between(now,endOfCourse);
        long days = Math.abs(duration.toDays());
        long hours = Math.abs(duration.minusDays(days).toHours());
        long minutes = Math.abs(duration.minusDays(days).minusHours(hours).toMinutes());
        System.out.println("Do końca kursu pozostało: "+ days + "dni, " + hours + "godzin, "+ minutes + "minut.");
    }
}
