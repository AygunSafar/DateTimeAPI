import java.util.Calendar;

public class Task2 {
    // Write a Java program to get and display information (year, month, day, hour, minute) about a default calendar.

    public static void displayInfo(){

        Calendar calendar=Calendar.getInstance();
        System.out.println(calendar.getTime() +"\n" +
                "Year: "+calendar.get(Calendar.YEAR)+"\n" +
                "Month: "+ calendar.get(Calendar.MONTH)+"\n" +
                "Day: "+ calendar.get(Calendar.DAY_OF_MONTH)+"\n" +
                "Hour: "+ calendar.get(Calendar.HOUR)+"\n"+
                "Minute: "+ calendar.get(Calendar.MINUTE));

    }
}
