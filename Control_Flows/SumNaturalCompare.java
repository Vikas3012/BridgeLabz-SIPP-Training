//Question 7
//CP - Write a program to find the sum of n natural numbers using for loop, compare the result with the
//formulae n*(n+1)/2 and show the result from both computations was correct.
//Hint =>
//1. Take the user input number and check whether it's a Natural number
//2. If it's a natural number Compute using formulae as well as compute using for loop
//3. Compare the two results and print the result

import java.util.Scanner;

class SumNaturalCompare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n >= 0) {
            int sumFormula = (n * (n + 1)) / 2;
            int sumLoop = 0;
            for (int i = 1; i <= n; i++) {
                sumLoop += i;
            }
            System.out.println("Sum using formula: " + sumFormula);
            System.out.println("Sum using loop: " + sumLoop);
            if (sumFormula == sumLoop) {
                System.out.println("Both results are correct");
            } else {
                System.out.println("Results are different");
            }
        } else {
            System.out.println("The number is not a natural number");
        }
    }
}













