//CP - Write a TemperaturConversion program, given the temperature in Celsius as input //outputs the
//temperature in Fahrenheit
//Hint =>
//1. Create a Celsius variable and take the temperature as user input
//2. Use the Formulae Celsius to Fahrenheit: (°C × 9/5) + 32 = °F and assign to //farenheitResult and
//print the result
//I/P => celsius
//O/P => The ____ celsius is _____ Fahrenheit

import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double celsius = input.nextDouble();
        double fahrenheitResult = (celsius * 9 / 5) + 32;
        System.out.println("The " + celsius + " celsius is " + fahrenheitResult + " fahrenheit");
    }
}
