//Question 27
//CP - Create a program to find the multiplication table of a number entered by the user from 6 to 9.
//Hint =>
//1. Take integer input and store it in the variable number
//2. Using a for loop, find the multiplication table of number from 6 to 9 and print it in the format number * i =


import java.util.Scanner;

class Multiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
}
