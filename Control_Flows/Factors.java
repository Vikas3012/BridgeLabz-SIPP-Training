//Question 17
//CP - Create a program to find the factors of a number taken as user input.
//Hint =>
//1. Get the input value for a variable named number. Check if the number entered is a positive integer.
//2. Create a counter variable and run the while loop till the counter is less than the user input number. In
//each iteration of the loop, check if the number is perfectly divisible by the counter. If true, print the value
//of the counter.

import java.util.Scanner;

class Factors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number > 0) {
            int counter = 1;
            while (counter <= number) {
                if (number % counter == 0) {
                    System.out.println(counter);
                }
                counter++;
            }
        } else {
            System.out.println("Enter a positive number");
        }
    }
}

