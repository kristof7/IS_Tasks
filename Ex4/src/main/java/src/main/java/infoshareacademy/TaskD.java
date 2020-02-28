package src.main.java.infoshareacademy;

import java.time.LocalDate;
import java.time.LocalTime;

public class TaskD {

    public static void taskD() throws InterruptedException {

        //------- time -------
        LocalTime now = LocalTime.now();
        LocalTime courseEndTime = LocalTime.of(14, 00, 0);
        long timeS = 60 - now.getSecond();
        long timeM = 60 - now.getMinute();
        long timeH = 24 - now.getHour();

        //------- date -------
        LocalDate today = LocalDate.now();
        LocalDate courseEndDate = LocalDate.of(2020, 7, 27);
        System.out.println("Today: " + today);
        System.out.println("End of course: " + courseEndDate);
        long dateD = ((((courseEndDate.getMonth().compareTo(today.getMonth()) - 1) * 30) + courseEndDate.getDayOfMonth() + 30) - today.getDayOfMonth()) + ((courseEndDate.getYear() - today.getYear()) * (365 / 1000));
        System.out.println("Time to the end of the course:");
        System.out.println(+dateD + " days, " + timeH + " hours, " + timeM + " minutes, " + timeS + " seconds");

    }
}

