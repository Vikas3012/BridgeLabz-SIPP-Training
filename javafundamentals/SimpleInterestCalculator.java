//CP - Write a program to input the Principal, Rate, and Time values and calculate Simple //Interest.
//Hint => Simple Interest = Principal * Rate * Time / 100
//I/P => principal, rate, time
//O/P => The Simple Interest is ___ for Principal ___, Rate of Interest ___ and Time ___

import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Principal amount: ");
        double principal = input.nextDouble();
        System.out.print("Enter Rate of Interest: ");
        double rate = input.nextDouble();
        System.out.print("Enter Time (in years): ");
        double time = input.nextDouble();
        double simpleInterest = (principal * rate * time) / 100;
        System.out.println("The Simple Interest is " + simpleInterest +
                           " for Principal " + principal +
                           ", Rate of Interest " + rate +
                           " and Time " + time);
    }
}
