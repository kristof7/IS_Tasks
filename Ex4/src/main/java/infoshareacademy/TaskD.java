package infoshareacademy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;


public class TaskD {

    public void time() throws ParseException {

        final String finishDate = "2020-07-26T14:00:00Z";
        final SimpleDateFormat apiFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.FRANCE);
        apiFormat.setTimeZone(TimeZone.getTimeZone("CET"));
        final Date finishParseDate = apiFormat.parse(finishDate);
        final long millis = finishParseDate.getTime() - System.currentTimeMillis();

        final String hms = String.format(" Do końca kursu zostało: %02d dni %02d godzin %02d minut %02d sekund",
                TimeUnit.MILLISECONDS.toDays(millis),
                TimeUnit.MILLISECONDS.toHours(millis) - TimeUnit.DAYS.toHours(TimeUnit.MILLISECONDS.toDays(millis)),
                TimeUnit.MILLISECONDS.toMinutes(millis) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(millis)),
                TimeUnit.MILLISECONDS.toSeconds(millis) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millis)));
        System.out.println(hms+ "\n\n");

    }
}
