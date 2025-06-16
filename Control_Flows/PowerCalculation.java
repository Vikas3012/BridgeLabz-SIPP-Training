//Question 16
//CP - Create a program to find the power of a number.
//Hint =>
//1. Get integer input for two variables named number and power.
//2. Create a result variable with an initial value of 1.
//3. Use the for loop from i = 1 to i <= power.
//4. In each iteration of the loop, multiply the result with the number and assign the value to the result.
//5. Finally, print the result

import java.util.Scanner;

class PowerCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int power = input.nextInt();
        int result = 1;
        for (int i = 1; i <= power; i++) {
            result *= number;
        }
        System.out.println("Result is " + result);
    }
}
