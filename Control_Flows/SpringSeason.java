//Question 10
//CP - Write a program SpringSeason that takes two int values month and day from the command line and
//prints “Its a Spring Season” otherwise prints “Not a Spring Season”.
//Hint =>
//1. Spring Season is from March 20 to June 20

import java.util.Scanner;

class SpringSeason {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month = input.nextInt();
        int day = input.nextInt();
        boolean isSpring = (month == 3 && day >= 20) ||
                (month == 4) ||
                (month == 5) ||
                (month == 6 && day <= 20);
        if (isSpring) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
















