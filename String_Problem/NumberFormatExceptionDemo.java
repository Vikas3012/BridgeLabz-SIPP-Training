import java.util.Scanner;

public class NumberFormatExceptionDemo {
    public static void generateException(String text) {
        int number = Integer.parseInt(text);
        System.out.println("Number: " + number);
    }

    public static void handleException(String text){
        try {
            int number = Integer.parseInt(text);
        }catch(NumberFormatException e) {
           System.out.println("Caught a NumberFormatException: " + e.getMessage());
        }catch(RuntimeException e){
            System.out.println("Caught a RuntimeException" + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String (Not a number): ");
        String input = sc.next();
        System.out.println("--- Generating NumberFormatException (No Handling) --- ");
        try {
            generateException(input);
        }catch (NumberFormatException e) {
            System.out.println("Caught in main: " + e.getMessage());
        }
        System.out.println("--- Handling NullPointerException (With try-catch) ---");
        handleException(input);
    }
}
