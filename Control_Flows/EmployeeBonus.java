//Question 21
//CP - Create a program to find the bonus of employees based on their years of service.
//Hint =>
//1. Zara decided to give a bonus of 5% to employees whose year of service is more than 5 years.
//2. Take salary and year of service in the year as input.
//3. Print the bonus amount.

import java.util.Scanner;

class EmployeeBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salary = input.nextDouble();
        int yearsOfService = input.nextInt();
        if (yearsOfService > 5) {
            double bonus = salary * 0.05;
            System.out.println("Bonus amount is: " + bonus);
        } else {
            System.out.println("No bonus");
        }
    }
}
