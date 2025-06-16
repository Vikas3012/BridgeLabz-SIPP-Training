//Question 2
//CP - Write a Program to find the factorial of an integer entered by the user.
//Hint =>
//1. For example, the factorial of 4 is 1 * 2 * 3 * 4 which is 24.
//2. Take an integer input from the user and assign it to the variable. Check the user has entered a positive
//integer.
//3. Using a while loop, compute the factorial.
//4. Print the factorial at the end.

import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        long factorial = 1;
        int i = 1;
        while (i <= number) {
            factorial *= i;
            i++;
        }
        System.out.println("Factorial is " + factorial);
    }
}










