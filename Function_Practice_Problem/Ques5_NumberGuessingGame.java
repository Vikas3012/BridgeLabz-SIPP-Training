import java.util.Scanner;
import java.util.Random;

public class Ques5_NumberGuessingGame {

    public static void main(String[] args) {
        System.out.println("Think of a number between 1 and 100.");
        System.out.println("I will try to guess it. Respond with 'high', 'low', or 'correct'.");

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int low = 1;
        int high = 100;
        boolean guessedCorrectly = false;

        while (!guessedCorrectly && low <= high) {
            int guess = generateGuess(low, high, random);
            System.out.println("Is it " + guess + "?");

            String feedback = getUserFeedback(scanner);

            switch (feedback.toLowerCase()) {
                case "high":
                    high = guess - 1;
                    break;
                case "low":
                    low = guess + 1;
                    break;
                case "correct":
                    System.out.println("Yay! I guessed your number: " + guess);
                    guessedCorrectly = true;
                    break;
                default:
                    System.out.println("Invalid input. Please type 'high', 'low', or 'correct'.");
            }
        }

        if (!guessedCorrectly) {
            System.out.println("Hmm... something doesn't add up. Are you sure you were honest?");
        }

    }

   
    public static int generateGuess(int low, int high, Random random) {
        return random.nextInt(high - low + 1) + low;
    }

    public static String getUserFeedback(Scanner scanner) {
        System.out.print("Your feedback (high/low/correct): ");
        return scanner.nextLine().trim();
    }
}
