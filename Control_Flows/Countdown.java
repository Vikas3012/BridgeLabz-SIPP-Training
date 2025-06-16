//Question 15
//CP - Write a program to count down the number from the user input value to 1 using a for loop for a rocket
//launch
//Hint =>
//1. Create a variable counter to take user inputted value for the countdown.
//2. Use the for loop to loop through the counter from end to the beginning
//3. Inside a for loop, print the value of the counter

import java.util.Scanner;

class Countdown {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = input.nextInt();
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
