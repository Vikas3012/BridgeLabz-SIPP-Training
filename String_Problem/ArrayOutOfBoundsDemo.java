import java.util.Scanner;

public class ArrayOutOfBoundsDemo {
    public static void generateException(String[] names){
        System.out.println("--- Generating ArrayOutOfBoundException ---");
        System.out.println("Names at ArrayOutOfBound " + names[names.length]);
    }
    public static void handleException(String[] names){
        System.out.println("--- Handling ArrayIndexOutOfBoundsException ---");
        try{
            System.out.println("Names at ArrayOutOfBound " + names[names.length]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }catch(RuntimeException e){
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        String[] names = new String[number];
        for (int i = 0; i < number; i++) {
            System.out.print("Enter the name: ");
            names[i] = sc.next();
        }
        try{
            generateException(names);
        }catch(ArrayIndexOutOfBoundsException e){
           System.out.println("Exception caught in main (optional catch): " + e.getMessage());
        }

        System.out.println("--- Handling Exception (With try-catch) ---");
        handleException(names);
    }
}
