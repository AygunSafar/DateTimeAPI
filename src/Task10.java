import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;

import static java.time.DayOfWeek.*;

public class Task10 {
    //Write a Java program to get the next and previous Fridays.

    public static void getFridays(){
        LocalDate date=LocalDate.now();
        LocalDate nextFriday = date.with(DayOfWeek.FRIDAY).plusWeeks(1);
        LocalDate previousFriday = date.with(DayOfWeek.FRIDAY).minusWeeks(1);
        System.out.println("Next Friday: "+nextFriday);
        System.out.println("Previous Friday: "+previousFriday);
    }
}
