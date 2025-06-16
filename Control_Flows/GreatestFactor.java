//Question 23
//CP - Create a program to print the greatest factor of a number beside itself using a loop.
//Hint =>
//1. Get an integer input and assign it to the number variable. As well as define a greatestFactor variable
//and assign it to 1
//2. Create a for loop that runs from last but one till 1 as in i = number - 1 to i = 1.
//3. Inside the loop, check if the number is perfectly divisible by i then assign i to greatestFactor variable
//and break the loop.
//4. Display the greatestFactor variable outside the loop


import java.util.Scanner;

class GreatestFactor{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int greatestFactor = 1;
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break;
            }
        }
        System.out.println("The greatest factor is " + greatestFactor);
    }
}
