// 3. Power Calculation
// Write a program that takes two numbers as input: a base and an exponent,
// and prints the result of base raised to the exponent (without using loops or
// conditionals).
import java.util.Scanner;

class PowerCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the base: ");
        double base = input.nextDouble();

        System.out.print("Enter the exponent: ");
        double exponent = input.nextDouble();

        double result = Math.pow(base, exponent);

        System.out.println(base + " raised to the power " + exponent + " is " + result);
    }
}





