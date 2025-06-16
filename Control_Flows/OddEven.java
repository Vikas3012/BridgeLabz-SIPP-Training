//Question 24
//CP - Create a program to print odd and even numbers between 1 to the number entered by the user.
//Hint =>
//1. Get an integer input from the user, assign it to a variable number and check for Natural Number
//2. Using a for loop, iterate from 1 to the number
//3. In each iteration of the loop, print the number as odd or even number

import java.util.Scanner;

class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number > 0) {
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is even");
                } else {
                    System.out.println(i + " is odd");
                }
            }
        } else {
            System.out.println("Enter a natural number");
        }
    }
}
