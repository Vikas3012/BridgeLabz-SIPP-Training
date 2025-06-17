import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        String number = sc.next();

        int length = number.length();
        int[] digits = new int[length];
        int[] frequency = new int[10];

        for (int i = 0; i < length; i++) {
            digits[i] = number.charAt(i) - '0';
        }

        for (int i = 0; i < length; i++) {
            frequency[digits[i]]++;
        }

        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " times");
            }
        }

        sc.close();
    }
}
