//Question 14
//CP - Write a program to check if a number is divisible by 5
//I/P => number
//O/P => Is the number ___ divisible by 5? ___

import java.util.Scanner;

class DivisibleBy5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        boolean divisible = number % 5 == 0;
        System.out.println("Is the number " + number + " divisible by 5? " + divisible);
    }
}
