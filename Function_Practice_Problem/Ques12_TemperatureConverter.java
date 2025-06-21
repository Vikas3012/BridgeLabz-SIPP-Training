import java.util.Scanner;

public class Ques12_TemperatureConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.println("Choose conversion type:");
        System.out.println("1: Fahrenheit to Celsius");
        System.out.println("2: Celsius to Fahrenheit");
        System.out.print("Enter your choice (1 or 2): ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                double f = getTemperatureInput(scanner, "Fahrenheit");
                double cFromF = fahrenheitToCelsius(f);
                System.out.printf("%.2f Fahrenheit = %.2f Celsius%n", f, cFromF);
                break;

            case 2:
                double c = getTemperatureInput(scanner, "Celsius");
                double fFromC = celsiusToFahrenheit(c);
                System.out.printf("%.2f Celsius = %.2f Fahrenheit%n", c, fFromC);
                break;

            default:
                System.out.println("Invalid choice. Please run the program again and enter 1 or 2.");
        }

    }

    
    public static double getTemperatureInput(Scanner scanner, String scale) {
        System.out.print("Enter temperature in " + scale + ": ");
        return scanner.nextDouble();
    }

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    
    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }
}
