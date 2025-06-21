
import java.time.LocalDate;
import java.util.Scanner;

public class Ques2_DateArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input in YYYY-MM-DD format
        System.out.print("Enter a date (yyyy-mm-dd): ");
        String input = scanner.nextLine();

        // Parse the input into a LocalDate
        LocalDate date = LocalDate.parse(input);

        // Add 7 days, 1 month, and 2 years
        LocalDate addedDate = date.plusDays(7).plusMonths(1).plusYears(2);
        System.out.println("After adding 7 days, 1 month, and 2 years: " + addedDate);

        // Subtract 3 weeks (21 days)
        LocalDate finalDate = addedDate.minusWeeks(3);
        System.out.println("After subtracting 3 weeks: " + finalDate);
    }
}
