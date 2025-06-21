import java.util.Scanner;

public class Ques10_RecursiveFactorial {

    public static void main(String[] args) {
        int number = getInput();
        long result = factorial(number);
        displayResult(number, result);
    }

    public static int getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int num = scanner.nextInt();

        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            System.exit(1);
        }

        return num;
    }

    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void displayResult(int number, long result) {
        System.out.println("Factorial of " + number + " is: " + result);
    }
}
