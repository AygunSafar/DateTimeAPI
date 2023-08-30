import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class Task7 {

    //Write a Java program to calculate the first and last day of each week.

    public static void getFirstAndLastDay(){
        LocalDate date= LocalDate.now();
        LocalDate firstDay=date.with(TemporalAdjusters.firstDayOfMonth());
        LocalDate lastDay=date.with(TemporalAdjusters.lastDayOfMonth());

        while(firstDay.isBefore(lastDay)){
            LocalDate firstDayOfWeek=firstDay.with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY));
            LocalDate lastDayOfWeek=lastDay.with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY));
            System.out.println("Week of "+firstDayOfWeek+"to "+lastDayOfWeek);
            firstDay=lastDayOfWeek.plusDays(1);
        }

        System.out.println(firstDay);
        
    }
}
