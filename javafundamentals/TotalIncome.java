//CP - Create a program to find the total income of a person by taking salary and bonus from //the user
//Hint =>
//1. Create a variable named salary and take user input.
//2. Create another variable bonus and take user input.
//3. Compute income by adding salary and bonus and print the result
//I/P => salary, bonus
//O/P => The salary is INR ___ and the bonus is INR ___. Hence Total Income is INR ___

import java.util.Scanner;

public class TotalIncome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter salary (INR): ");
        double salary = input.nextDouble();
        System.out.print("Enter bonus (INR): ");
        double bonus = input.nextDouble();
        double totalIncome = salary + bonus;
        System.out.println("The salary is INR " + salary + " and the bonus is INR " + bonus +
                           ". Hence Total Income is INR " + totalIncome);
    }
}
