import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Task6 {

    //Write a Java program to get the last day of the current month.

    public static void getLastDayOfMonth(){
        LocalDate date=LocalDate.of(2023,6,18);
        System.out.println(date.getMonth().maxLength());

    }
}
