import java.util.Scanner;

public class Ques9_PalindromeChecker {

    public static void main(String[] args) {
        String input = getInput();
        boolean isPalindrome = checkPalindrome(input);
        displayResult(input, isPalindrome);
    }

    public static String getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word or phrase: ");
        String userInput = scanner.nextLine();
        return userInput;
    }

    public static boolean checkPalindrome(String str) {
        String cleaned = str.replaceAll("[^a-zA-Z]", "").toLowerCase();
        int left = 0;
        int right = cleaned.length() - 1;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    
    public static void displayResult(String original, boolean isPalindrome) {
        if (isPalindrome) {
            System.out.println("\"" + original + "\" is a palindrome.");
        } else {
            System.out.println("\"" + original + "\" is not a palindrome.");
        }
    }
}
