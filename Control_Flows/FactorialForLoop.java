//Question 4
//CP - Write a Program to find the factorial of an integer entered by the user.
//Hint =>
//1. For example, the factorial of 4 is 1 * 2 * 3 * 4 which is 24.
//2. Take an integer input from the user and assign it to the variable. Check the user has entered a positive
//integer.
//3. Using a for loop, compute the factorial.
//4. Print the factorial at the end.

import java.util.Scanner;

class FactorialForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        long factorial = 1;
        if (number >= 0) {
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            System.out.println("Factorial is " + factorial);
        } else {
            System.out.println("Invalid input. Enter a positive integer.");
        }
    }
}










