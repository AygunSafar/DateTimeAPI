import java.util.Calendar;

public class Task4 {
    //Write a Java program to get the minimum value of year, month, week, date from the current date of a default calendar.

    public static void getMinimumValues() {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime() + "\n" +
                "minimum value of the year: " + calendar.getMinimum(Calendar.YEAR) + "\n" +
                "minimum value of the month: " + calendar.getMinimum(Calendar.MONTH) + "\n" +
                "minimum value of the week: " + calendar.getMinimum(Calendar.WEEK_OF_YEAR) + "\n" +
                "minimum value of the date: " + calendar.getMinimum(Calendar.DATE) + "\n");

    }
}
