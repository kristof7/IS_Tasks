package kasia42;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;


class TaskD {


    public static void main(String[] args) {


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss:ns");
        LocalDateTime dateTime = LocalDateTime.of(2020,7,26,14,00,0);
        System.out.println(dateTime.format(formatter));

        LocalDateTime date1 = LocalDateTime.now();
        System.out.println(date1.format(formatter));

        Period period = Period.between(LocalDate.from(date1), LocalDate.from(dateTime));

        LocalDateTime firstTime = LocalDateTime.now();
        LocalDateTime secondTime = LocalDateTime.of(2020, 07,26,14,00,00);


        Duration duration = Duration.between(firstTime, secondTime);



        System.out.println(duration.toDays()+"dni");
        System.out.print(duration.toHoursPart()+"godzin"+" ");
        System.out.print( duration.toMinutesPart()+"minut"+" ");
        System.out.print(duration.toSecondsPart()+"sekund"+" ");










    }
}

