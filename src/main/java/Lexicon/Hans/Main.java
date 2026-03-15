package Lexicon.Hans;

import java.time.Period;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Instant;
import java.time.format.DateTimeFormatter;

public class Main {
    static void main() {

        //Exercise 1: Create a LocalDate of the current day and print it out.
        LocalDate currentDate = LocalDate.now();
        System.out.println("\nThe date is: " + currentDate);

        //Exercise 2: Print out the current date using DateTimeFormatter.
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("eeee dd MMMM");
        String formattedTime = currentDate.format(formatter);
        System.out.println(formattedTime + "\n");

        //Exercise 3: Print out the last weeks dates in standard yyyy-mm-dd format.
        LocalDate specificDate = LocalDate.of(2026, 2, 23);
        for (int i=0; i<7; i++) {
            System.out.println(specificDate);
            specificDate = specificDate.plusDays(1);
        }

        //Exercise 4: Create a LocalDate object from a String by using the .parse() method.
        LocalDate parseTheString = LocalDate.parse("1999-12-30");
        System.out.println("\nCreated by .parse() method: " + parseTheString);

        //Exercise 5: Create a LocalDate of your birthday and print the day enum of that date.
        LocalDate birthDay = LocalDate.of(1986, 9, 14);
        formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd->eeee");
        System.out.println("\n" + birthDay.format(formatter));

        //Exercise 6: Print out the month enum of the current date plus 10 years and minus 10 months.
        LocalDate futureDate = LocalDate.now();
        futureDate = futureDate.plusYears(10);
        futureDate = futureDate.minusMonths(10);
        formatter = DateTimeFormatter.ofPattern("MMMM");
        System.out.println("\nFuture date month: " + futureDate.format(formatter));

        //Exercise 7: Create a Period and print out the years, months and dates elapsed between your birthday
        // and the future date from exercise 6.
        Period timePeriod = Period.between(birthDay, futureDate);
        System.out.println("\n" + timePeriod.getYears() + " years, " + timePeriod.getMonths() + " months and " +
                timePeriod.getDays() + " days.");

        //Exercise 8: Create a Period of 4y, 7m, 29d. Then add the period to a LocalDate of the current date.
        Period period8Exercise = Period.of(4,7,29);
        LocalDate currentDatePeriod = LocalDate.now();
        currentDatePeriod = currentDate.plus(period8Exercise);
        System.out.println("\ncurrentDatePeriod: " + currentDatePeriod);

        //Exercise 9: Create a LocalTime object of the current time.
        LocalTime currentTime = LocalTime.now();
        System.out.println("\ncurrentTime: " + currentTime);

        //Exercise 10: Print the nanoseconds from the current time.
        int nanoSeconds = currentTime.getNano();
        System.out.println("\n" + nanoSeconds + " nanoseconds.");

        //Exercise 11: Create a LocalTime from String.
        LocalTime stringTime = LocalTime.parse("11:30:00");
        System.out.println("\nstringTime: " + stringTime);


    }//Main
}
