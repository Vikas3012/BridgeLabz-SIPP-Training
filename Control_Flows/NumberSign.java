//Question 9
//CP - Write a program to check whether a number is positive, negative, or zero.
//Hint =>
//1. Get integer input from the user and store it in the number variable.
//2. If the number is positive, print positive.
//3. If the number is negative, print negative.
//4. If the number is zero, print zero.

import java.util.Scanner;

class NumberSign {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }
}















