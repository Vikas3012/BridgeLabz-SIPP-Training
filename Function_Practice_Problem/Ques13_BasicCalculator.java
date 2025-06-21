import java.util.Scanner;

public class Ques13_BasicCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Basic Calculator");
        System.out.println("Choose an operation:");
        System.out.println("1: Addition (+)");
        System.out.println("2: Subtraction (-)");
        System.out.println("3: Multiplication (*)");
        System.out.println("4: Division (/)");
        System.out.print("Enter your choice (1-4): ");
        int choice = scanner.nextInt();

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        switch (choice) {
            case 1:
                System.out.println("Result: " + add(num1, num2));
                break;

            case 2:
                System.out.println("Result: " + subtract(num1, num2));
                break;

            case 3:
                System.out.println("Result: " + multiply(num1, num2));
                break;

            case 4:
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is undefined.");
                } else {
                    System.out.println("Result: " + divide(num1, num2));
                }
                break;

            default:
                System.out.println("Invalid choice. Please run the program again and enter a number between 1 and 4.");
        }

    }

    
    public static double add(double a, double b) {
        return a + b;
    }

    
    public static double subtract(double a, double b) {
        return a - b;
    }


    public static double multiply(double a, double b) {
        return a * b;
    }


    public static double divide(double a, double b) {
        return a / b;
    }
}
