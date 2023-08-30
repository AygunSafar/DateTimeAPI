import java.time.LocalDateTime;
import java.time.ZoneId;

public class Task5 {

    //Write a Java program to get the current time in New York.

    public static void getTimeInNewYork(){
        ZoneId zoneId= ZoneId.of("America/New_York");
        LocalDateTime dateTime=LocalDateTime.now(zoneId);
        System.out.println(dateTime);
    }


}
