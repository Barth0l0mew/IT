package OOP.Dates;

import java.text.SimpleDateFormat;
import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Dates {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);
        LocalTime time = LocalTime.now();
        System.out.println(time);
        Date dateNow = new Date();
        System.out.println(dateNow);
        LocalDateTime LDT = LocalDateTime.now();
        System.out.println(LDT);
        DateTimeFormatter DTF = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatedDate = DTF.format(date);
        System.out.println(formatedDate);
        System.out.println(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm").format(LocalDateTime.now()));
      //  перевод даты в строку
        LocalDateTime dateTime = LocalDateTime.parse("2024-02-20T19:34");
        System.out.println(dateTime);
        System.out.println(dateTime.format(DTF));
        Calendar calendar = new GregorianCalendar();
        Date date2 = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yy");
        System.out.println(simpleDateFormat.format(date2));
        calendar.add(Calendar.DATE,22);
        System.out.println(simpleDateFormat.format(calendar.getTime()));
        TimeZone timeZone = TimeZone.getDefault();
        System.out.println(timeZone);
    }
}
