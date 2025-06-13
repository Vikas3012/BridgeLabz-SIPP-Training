// 4. Calculate Average of Three Numbers
// Write a program that takes three numbers as input from the user and prints
// their average.


import java.util.Scanner;

class AverageOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();
        double average = (num1 + num2 + num3) / 3;
        System.out.println("The average is " + average);
    }
}






