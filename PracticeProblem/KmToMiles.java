// 5. Convert Kilometers to Miles
// Write a program that takes the distance in kilometers as input from the user
// and converts it into miles using the formula:
// Miles = Kilometers * 0.621371.

import java.util.Scanner;

class KmToMiles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kilometers = input.nextDouble();
        double miles = kilometers * 0.621371;
        System.out.println("The distance in miles is " + miles);
    }
}







