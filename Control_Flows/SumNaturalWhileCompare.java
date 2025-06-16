//Question 11
//CP - Write a program to find the sum of n natural numbers using while loop compare the result with the
//formulae n*(n+1)/2 and show the result from both computations was correct.
//Hint =>
//1. Take the user input number and check whether it's a Natural number
//2. If it's a natural number Compute using formulae as well as compute using while loop
//3. Compare the two results and print the result

import java.util.Scanner;

class SumNaturalWhileCompare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n >= 0) {
            int sumFormula = (n * (n + 1)) / 2;
            int sumWhile = 0, i = 1;
            while (i <= n) {
                sumWhile += i;
                i++;
            }
            System.out.println("Sum using formula: " + sumFormula);
            System.out.println("Sum using while loop: " + sumWhile);
            if (sumFormula == sumWhile) {
                System.out.println("Both results are correct");
            } else {
                System.out.println("Results are different");
            }
        } else {
            System.out.println("The number is not a natural number");
        }
    }
}

















