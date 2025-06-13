//1. Calculate Simple Interest
//Write a program to calculate simple interest using the formula:
//Simple Interest = (Principal * Rate * Time) / 100.
//Take Principal, Rate, and Time as inputs from the user.

import java.util.Scanner;

public class SI {
    static public void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principal of SI : ");
        int Principal = sc.nextInt();
        
        System.out.println("Enter Rate of SI : ");
        int Rate = sc.nextInt();
        
        System.out.println("Enter principal amount : ");
        int Time = sc.nextInt();
        
        int SimpleInterest = (Principal * Rate * Time) / 100;
        System.out.println(" Simple Interest : " +SimpleInterest);
    }
}



