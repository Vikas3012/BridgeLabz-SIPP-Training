import java.util.Scanner;

public class ReverseNumberArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        String input = sc.next();
        int length = input.length();

        int[] digits = new int[length];
        int[] reversed = new int[length];

        for (int i = 0; i < length; i++) {
            digits[i] = input.charAt(i) - '0';
        }

        for (int i = 0; i < length; i++) {
            reversed[i] = digits[length - 1 - i];
        }

        System.out.print("Reversed number: ");
        for (int i = 0; i < length; i++) {
            System.out.print(reversed[i]);
        }

        sc.close();
    }
}
