package infoshareacademy;

import java.time.*;
import java.time.temporal.ChronoUnit;

import static java.time.temporal.ChronoUnit.DAYS;

public class TaskD {

    public static void main() {

        System.out.println("=============Homework====D=============");
        LocalDateTime czas_obecny = LocalDateTime.now();
        LocalDateTime domowe_D = LocalDateTime.of(2020,07,26,14,00);

        long years = czas_obecny.until(domowe_D, ChronoUnit.YEARS);
        czas_obecny = czas_obecny.plusYears(years);
        long months = czas_obecny.until(domowe_D, ChronoUnit.MONTHS);
        czas_obecny = czas_obecny.plusMonths(months);
        long days = czas_obecny.until(domowe_D, DAYS);
        czas_obecny = czas_obecny.plusDays(days);
        long hours = czas_obecny.until(domowe_D, ChronoUnit.HOURS);
        czas_obecny = czas_obecny.plusHours(hours);
        long minutes = czas_obecny.until(domowe_D, ChronoUnit.MINUTES);

        System.out.println("Do zakonczenia kursu pozostalo : " +years+" lat, "+months+" miesiecy, "+days+" dni, "+hours+" godzin, "+minutes+" minut");
    }
}
