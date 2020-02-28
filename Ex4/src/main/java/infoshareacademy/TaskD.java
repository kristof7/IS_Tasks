package infoshareacademy;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class TaskD {
    public void howMuchTimeIsLeft(){
        LocalDateTime today = LocalDateTime.now();
        LocalDateTime endOfTheCourse = LocalDateTime.of(2020, Month.JULY,26,14,0,0);

        long days = today.until(endOfTheCourse, ChronoUnit.DAYS);
        today = today.plusDays(days);
        long hours = today.until(endOfTheCourse, ChronoUnit.HOURS);
        today = today.plusHours(hours);
        long minutes = today.until(endOfTheCourse, ChronoUnit.MINUTES);
        today = today.plusMinutes(minutes);

        System.out.println("Do końca kursu: "+days +" dni "+hours+" godzin "+minutes +" minut.");


    }
}
