//Question 5
//CP - Write a program to check for the natural number and write the sum of n natural numbers
//Hint =>
//1. A Natural Number is a positive integer (1,2,3, etc) sometimes with the inclusion of 0
//2. A sum of n natural numbers is n * (n+1) / 2
//I/P => number
//O/P =>
//If the number is a positive integer then the output is
//The sum of ___ natural numbers is ___
//Otherwise the output is
//The number ___ is not a natural number

import java.util.Scanner;

class SumNaturalNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number >= 0) {
            int sum = (number * (number + 1)) / 2;
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        } else {
            System.out.println("The number " + number + " is not a natural number");
        }
    }
}











