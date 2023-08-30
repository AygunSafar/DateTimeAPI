import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task11 {

    //Write a Java program to print yyyy-MM-dd, HH:mm:ss, yyyy-MM-dd HH:mm:ss,
    // E MMM yyyy HH:mm:ss.SSSZ and HH:mm:ss,Z format pattern for date and time.

    public static void formatDate(){
        LocalDateTime localDateTime=LocalDateTime.now();

        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter timeFormatter=DateTimeFormatter.ofPattern("HH-mm-ss");
        DateTimeFormatter dateAndTimeFormatter=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");


        String formattedDate=localDateTime.format(dateTimeFormatter);
        String formattedTime=localDateTime.format(timeFormatter);
        String formattedDateAndTime=localDateTime.format(dateAndTimeFormatter);

        System.out.println(formattedDate);
        System.out.println(formattedTime);
        System.out.println(formattedDateAndTime);


    }
}
