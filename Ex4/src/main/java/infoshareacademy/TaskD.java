package infoshareacademy;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

import static java.lang.System.*;

public class TaskD {
    private LocalDateTime now = LocalDateTime.now();
    private LocalDateTime endOfCourse = LocalDateTime.of(2020,
            Month.JULY,
            26,
            14,
            0);

    public void startTaskD() {
        long difference = ChronoUnit.MINUTES.between(now, endOfCourse);
        long daysLeft = difference/(60*24);
        long hoursLeft = (difference-(daysLeft*24*60))/60;
        long minutesLeft = difference-(daysLeft*24*60)-(hoursLeft*60);

        out.println("\n");
        out.println("Task D:");
        out.print("Until the end of the course there are: ");
        out.print(daysLeft + " days, " +
                hoursLeft + " hours and " +
                minutesLeft + " minutes left.");
    }
}
