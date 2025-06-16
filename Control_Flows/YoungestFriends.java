//Question 18
//CP - Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages
//and the tallest among the friends based on their heights
//Hint =>
//1. Take user input for the age and height of the 3 friends and store it in a variable
//2. Find the smallest of the 3 ages to find the youngest friend and display it
//3. Find the largest of the 3 heights to find the tallest friend and display it

import java.util.Scanner;

class YoungestFriends {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ageAmar = input.nextInt();
        int heightAmar = input.nextInt();
        int ageAkbar = input.nextInt();
        int heightAkbar = input.nextInt();
        int ageAnthony = input.nextInt();
        int heightAnthony = input.nextInt();
        int youngestAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
        int tallestHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));
        System.out.println("Youngest age is " + youngestAge);
        System.out.println("Tallest height is " + tallestHeight);
    }
}

