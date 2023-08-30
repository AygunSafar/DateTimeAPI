import java.util.Calendar;

public class Task3 {

    //Write a Java program to get the maximum value of the year,
    // month, week, and date from the current date of a default calendar.

    public static void getMaximumValues() {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime() + "\n" +
                "maximum value of the year: " + calendar.getActualMaximum(Calendar.YEAR) + "\n" +
                "maximum value of the month: " + calendar.getActualMaximum(Calendar.MONTH) + "\n" +
                "maximum value of the week: " + calendar.getActualMaximum(Calendar.WEEK_OF_YEAR) + "\n" +
                "maximum value of the date: " + calendar.getActualMaximum(Calendar.DATE) + "\n");


    }
}
