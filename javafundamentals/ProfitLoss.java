//CP - Create a program to calculate the profit and loss in number and percentage based on the cost price
//of INR 129 and the selling price of INR 191.
//Hint =>
//Use a single print statement to display multiline text and variables.
//Profit = selling price - cost price
//Profit Percentage = profit / cost price * 100
//I/P => NONE
//O/P =>
//The Cost Price is INR ___ and the Selling Price is INR ___
//The Profit is INR ___ and the Profit Percentage is ___

import java.util.Scanner;
class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Selling Price : ");
        int sellingPrice = sc.nextInt();
        System.out.println("Enter the Cost Price : ");
        int costPrice = sc.nextInt();
        int profit = sellingPrice - costPrice;
        int profitPercentage = profit /100;

        System.out.println("The Cost Price is INR : "+costPrice+ " and the Selling Price is INR:" +sellingPrice);
        System.out.println("The Profit is INR : " +profit+ " and the Profit Percentage is " + profitPercentage);
    }
}