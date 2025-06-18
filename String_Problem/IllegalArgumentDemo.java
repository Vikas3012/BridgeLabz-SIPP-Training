import java.util.Scanner;

public class IllegalArgumentDemo {
        public static void generateException(String text) {
        if (text.length() < 5) {
        throw new IllegalArgumentException("Input must be at least 5 characters long");
        }
        // This will crash the program if not handled
        // Start index > End index => IllegalArgumentException
        String result = text.substring(5, 2); 
        System.out.println("This won't print: " + result);
    }

    // Method that handles the exception properly
    public static void handleException(String text) {
        try {
            String result = text.substring(5, 2); // start > end
            System.out.println("Result: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String input = sc.next();
        System.out.println("--- Generating Exception (No Handling) ---");
        try{
            generateException(input);
        }catch(IllegalArgumentException e){
           System.out.println("Exception caught in main (optional catch): " + e.getMessage());
        }

        // 2. This will handle the exception inside the method
        System.out.println("--- Handling Exception (With try-catch) ---");
        handleException(input);
    }
    
}
