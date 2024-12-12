package _06_class.example.java_date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDate myObj = LocalDate.now();
        System.out.println(myObj);

        LocalDateTime myObj2 = LocalDateTime.now();
        System.out.println(myObj2);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDate = myObj2.format(myFormatObj);
        System.out.println(formattedDate);
    }
}
