package Lexicon.Hans;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    static void main() {

        //Exercise 1: Create a LocalDate of the current day and print it out.
        LocalDate currentDate = LocalDate.now();
        System.out.println("\nThe date is: " + currentDate);

        //Exercise 2: Print out the current date using DateTimeFormatter.
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("eeee dd MMMM");
        String formattedTime = currentDate.format(formatter);
        System.out.println(formattedTime);
    }
}
