//Question 1
//CP - Write a program to count down the number from the user input value to 1 using a while loop for a rocket
//launch
//Hint =>
//1. Create a variable counter to take user inputted value for the countdown.
//2. Use the while loop to check if the counter is 1
//3. Inside a while loop, print the value of the counter and decrement the counter

import java.util.Scanner;

class RocketCountdown {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = input.nextInt();
        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }
    }
}









