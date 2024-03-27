//inbuilt functions in java
import java.time.*;

public class UtilityClasses {
    public static void main(String[] args){
        LocalDate d=LocalDate.now();   //returns current date
        System.out.println("Current date is "+d);   //format: yyyy-mm-dd
        LocalDate d2=d.plusDays(5);   //returns date after 5 days
        System.out.println("updated date: "+d2);

        System.out.println("Date after 5 days is "+d.parse("2028-11-12"));   //will assigned with the date in the double quotes
        LocalTime t=LocalTime.now();   //returns current time
        System.out.println("Current time is "+t);

        LocalDateTime dt=LocalDateTime.now();   //returns both current date and time together
        System.out.println(dt);
        //DateTime is immutable and thread safe

        ZonedDateTime zt=ZonedDateTime.now(ZoneId.of("Europe/Athens"));
        System.out.println("Current Date and Time in Europe/Athens is "+zt);

        System.out.println(Period.between(d,d2));  //returns no.of days between given two dates
    }
}