//Question 29
//CP - Write a program FizzBuzz, take a number as user input, and check for a positive integer. If positive
//integer, loop and print the number, but for multiples of 3 print "Fizz" instead of the number, for multiples of 5
//print "Buzz", and for multiples of both print "FizzBuzz".
//Hint =>
//1. Take the user input number and check if it is a positive integer
//2. Use while loop to display the output


import java.util.Scanner;

class FizzBuzz2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number > 0) {
            int i = 1;
            while (i <= number) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
                i++;
            }
        } else {
            System.out.println("Please enter a positive integer");
        }
    }
}
