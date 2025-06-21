import java.util.Scanner;

public class Ques11_GCDAndLCMCalculator {

    public static void main(String[] args) {
        int[] numbers = getInput();
        int a = numbers[0];
        int b = numbers[1];

        int gcd = calculateGCD(a, b);
        int lcm = calculateLCM(a, b, gcd);

        displayResults(a, b, gcd, lcm);
    }

    public static int[] getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first positive integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second positive integer: ");
        int num2 = scanner.nextInt();
        

        if (num1 <= 0 || num2 <= 0) {
            System.out.println("Only positive integers are allowed.");
            System.exit(1);
        }

        return new int[] { num1, num2 };
    }

    public static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int calculateLCM(int a, int b, int gcd) {
        return (a * b) / gcd;
    }

    public static void displayResults(int a, int b, int gcd, int lcm) {
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd);
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
    }
}
