package OOP.Dates;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

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
    }
}
