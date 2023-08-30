import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Task8 {

    //Write a Java program to get a date after 2 weeks.

    public static void getDateAfterTwoWeeks(){
        LocalDate localDate= LocalDate.now();
        localDate =localDate.plusWeeks(2);
        System.out.println(localDate);
    }
}
