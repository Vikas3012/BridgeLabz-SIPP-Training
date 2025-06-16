//Question 25
//CP - Create a program to find the power of a number.
//Hint =>
//1. Get integer input for two variables named number and power.
//2. Create a result variable with an initial value of 1.
//3. Create a temp variable counter and initialize to zero. Use the while loop till counter == power.
//4. In each iteration of the loop, multiply the result with the number and assign the value to the result. Also
//increment the counter.
//5. Finally, print the result

import java.util.Scanner;

class Power {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int power = input.nextInt();
        int result = 1;
        int counter = 0;
        while (counter < power) {
            result *= number;
            counter++;
        }
        System.out.println("Result is " + result);
    }
}
