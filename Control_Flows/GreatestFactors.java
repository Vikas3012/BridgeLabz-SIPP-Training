//Question 26
//CP - Create a program to print the greatest factor of a number beside itself using a loop.
//Hint =>
//1. Get an integer input and assign it to the number variable. As well as define the greatestFactor variable
//and assign it to 1
//2. Create a variable counter and assign counter = number - 1;. Use the while loop till the counter is
//equal to 1.
//3. Inside the loop, check if the number is perfectly divisible by the counter then assign the counter to
//greatestFactor variable and break the loop.
//4. Display the greatestFactor variable outside the loop

import java.util.Scanner;

class GreatestFactors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int greatestFactor = 1;
        int counter = number - 1;
        while (counter >= 1) {
            if (number % counter == 0) {
                greatestFactor = counter;
                break;
            }
            counter--;
        }
        System.out.println("The greatest factor is " + greatestFactor);
    }
}
