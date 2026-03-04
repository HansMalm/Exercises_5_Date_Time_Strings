package Lexicon.Hans;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    static void main() {

        //Exercise 1 Create a LocalDate of the current day and print it out.
        LocalDate currentDate = LocalDate.now();
        System.out.println("\nThe date is: " + currentDate);
    }
}
