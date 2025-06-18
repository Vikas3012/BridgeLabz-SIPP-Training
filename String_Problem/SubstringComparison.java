import java.util.Scanner;

public class SubstringComparison {
    public static String createSubString(String str, int start, int end){
        String result = "";
        for (int i = start; i < end; i++) {
            result += str.charAt(i);
        }
        return result;
    }
    public static boolean compareStrings(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String text = sc.next();
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();
        String substrCharAt = createSubString(text, start, end);

        String substrBuiltIn = text.substring(start, end);

        boolean areEqual = compareStrings(substrCharAt, substrBuiltIn);

        System.out.println("\nSubstring using charAt(): " + substrCharAt);
        System.out.println("Substring using built-in substring(): " + substrBuiltIn);
        System.out.println("Are both substrings equal? " + areEqual);
    }
}
