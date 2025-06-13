//CP - Create a program to find the maximum number of handshakes among N number of students.
//Hint =>
//1. Get integer input for the numberOfStudents variable.
//2. Use the combination = (n * (n - 1)) / 2 formula to calculate the maximum number of //possible
//handshakes.
//3. Display the number of possible handshakes.


import java.util.Scanner;

public class MaxHandshakes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
        System.out.println("The maximum number of possible handshakes is " + handshakes);
    }
}
