import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task9 {

    //Write a Java program to convert a string to a date.

    public static void convertDate(String s){

        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate date=LocalDate.parse(s,dateTimeFormatter);
        System.out.println(s);


    }
}
