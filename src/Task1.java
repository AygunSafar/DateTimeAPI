import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Task1 {

    //Write a Java program to create a Date object using the Calendar class.

    public static void getTime(){
        Calendar calendar= Calendar.getInstance();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year=sc.nextInt();
        System.out.println("Enter the month: ");
        int month=sc.nextInt();
        System.out.println("Enter the day: ");
        int day=sc.nextInt();

        calendar.set(Calendar.YEAR,year);
        calendar.set(Calendar.MONTH,month+1);
        calendar.set(Calendar.DATE,day);
        Date date= calendar.getTime();
        System.out.println(date);
    }
}
