
public class NullPointerDemo {
    public static void generateException() {
        String text = null;
        int length = text.length();
        System.out.println("Length: " + length);
    }

    public static void handleException() {
        String text = null;
        try {
            int length = text.length();
            System.out.println("Length: " + length);

        } catch (NullPointerException e) {
            System.out.println("Caught a NullPointerException : " + e.getMessage());
        } catch (RuntimeException e){
            System.out.println("Caught a RunTimeException : " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        System.out.println("--- Generating NullPointerException (No Handling) ---");
        try {
            generateException();
        } catch (NullPointerException e) {
            System.out.println("Caught in main: " + e.getMessage());
        }

        System.out.println("--- Handling NullPointerException (With try-catch) ---");
        handleException();
    }

}
