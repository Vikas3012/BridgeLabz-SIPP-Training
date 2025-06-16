//Question 8
//CP - Write a program to check if the first is the smallest of the 3 numbers.
//I/P => number1, number2, number3
//O/P => Is the first number the smallest? ____

import java.util.Scanner;

class SmallestFirst {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        boolean isSmallest = number1 <= number2 && number1 <= number3;
        System.out.println("Is the first number the smallest? " + isSmallest);
    }
}














