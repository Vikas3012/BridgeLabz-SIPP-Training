import java.util.Scanner;

public class UppercaseComparison {
    public static String customToUpperCase(String text){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if(ch >= 'a' && ch <='z'){
                ch = (char)(ch - 32);
            }
            result.append(ch);
        }
        return result.toString();
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
        System.out.print("Enter your text: ");
        String input = sc.nextLine();

        String customUpper = customToUpperCase(input);

        String builtInUpper = input.toUpperCase();

        boolean areEqual = compareStrings(customUpper, builtInUpper);

        System.out.println("Custom Uppercase: " + customUpper);
        System.out.println("Built-in Uppercase: " + builtInUpper);
        System.out.println("Do both match? " + areEqual);
    }
}