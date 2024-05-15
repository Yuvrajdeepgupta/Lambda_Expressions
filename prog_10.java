/*Write a Java program that takes a LocalDateTime object and formats it to
a custom string format ("yyyy-MM-dd HH:mm:ss"). Define a LocalDateTime
object representing a specific date and time. Use DateTimeFormatter to format
the LocalDateTime object to the desired string format.*/

import java.time.*;
import java.time.format.*;

public class prog_10 
{
    public static void main(String[] args) 
    {
        LocalDateTime dateTime=LocalDateTime.of(2012,4,15,14,30,0);

        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        String formattedDateTime=dateTime.format(formatter);

        System.out.println("Formatted Date-Time: "+formattedDateTime);
    }
}

//Output:
//	Formatted Date-Time: 2012-04-15 14:30:00
