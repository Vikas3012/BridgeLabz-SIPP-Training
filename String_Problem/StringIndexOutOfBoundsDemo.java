import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {
    public static void generateException(String text){
        char ch = text.charAt(text.length());
        System.out.println("Character: " + ch);
    }
    public static void handleException(String text){
        try{
            char ch = text.charAt(text.length());
            System.out.println("Character: " + ch);
        }catch(StringIndexOutOfBoundsException e){
           System.out.println("Caught StringOutOfBoundException : " + e.getMessage());
        }catch(RuntimeException e){
            System.out.println("Caught RunTimeException : " + e.getMessage());
        } 

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String input = sc.next();
        System.out.println("--- Generating Exception (No Handling) ---");
        try {
            generateException(input);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught in main: " + e.getMessage());
        }

        System.out.println("\n--- Handling Exception (With try-catch) ---");
        handleException(input);
    
    }
    
}
