//Question 6
//CP - Write a program to find the sum of numbers until the user enters 0
//Hint =>
//1. Create a variable total of type double initialize to 0.0. Also, create a variable to store the double value
//the user enters
//2. Use the while loop to check if the user entered is 0
//3. If the user entered value is not 0 then inside the while block add user entered value to the total and ask
//the user to input again
//4. The loop will continue till the user enters zero and outside the loop display the total value

import java.util.Scanner;

class SumUntilZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0.0;
        while (true) {
            double num = input.nextDouble();
            if (num == 0.0) {
                break;
            }
            total += num;
        }
        System.out.println("The total sum is " + total);
    }
}












