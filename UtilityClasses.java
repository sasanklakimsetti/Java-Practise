//inbuilt functions in java
import java.time.*;
import java.time.format.DateTimeFormatter;

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

        LocalDate ld3=LocalDate.parse("2002-11-12");
        System.out.println(ld3);
        LocalDate ld4=LocalDate.of(2023,07,07);
        System.out.println(ld4);

        LocalDate  ld5=LocalDate.now();
        System.out.println(ld5);
        LocalDate ld6=ld5.plusMonths(50);
        System.out.println(ld6);
        Period p1=Period.between(ld5,ld6);
        System.out.println(p1);

        DateTimeFormatter f=DateTimeFormatter.ofPattern("dd-MM-yyyy");    //month must be given in capital.  otherwise will give error
        System.out.println(ld5.format(f));
        DateTimeFormatter f2=DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        DateTimeFormatter f3=DateTimeFormatter.ofPattern("dd-MMMM-yyyy");
        System.out.println(ld5.format(f2));
        System.out.println(ld5.format(f3));
    }
}