//CP - Write a program to input the unit price of an item and the quantity to be bought. //Then, calculate the
//total purchase price.
//Hint => NA
//I/P => unitPrice, quantity
//O/P => The total purchase price is INR ___ if the quantity ___ and the unit price is INR ___

import java.util.Scanner;

public class PurchaseCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter unit price (INR): ");
        double unitPrice = input.nextDouble();
        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();
        double totalPrice = unitPrice * quantity;
        System.out.println("The total purchase price is INR " + totalPrice +
                           " if the quantity is " + quantity +
                           " and the unit price is INR " + unitPrice);
    }
}
