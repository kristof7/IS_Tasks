package infoshareacademy;

import java.time.Duration;
import java.time.LocalDateTime;

public class TaskD {
//Napisz metodę, która wyświetli informację, ile czasu pozostało do końca kursu (czyli do 26 lipca 2020 14:00).
//Np.:
//Do końca kursu: 153 dni 6 godzin 20 minut.
//Metoda powinna wykorzystywać Date API (JSR-310).

    public static void infoDisplay() {

        LocalDateTime nowDate = LocalDateTime.now();
        LocalDateTime definied = LocalDateTime.of(2020, 07, 26, 14, 00);
        Duration count = Duration.between(nowDate, definied);


        System.out.println("days:" + count.toDays() + " hours:" + count.toHoursPart()  + " minutes:" + count.toMinutesPart());

    }
}
