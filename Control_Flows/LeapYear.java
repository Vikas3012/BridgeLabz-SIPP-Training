//Question 31
//CP - Write a LeapYear program that takes a year as input and outputs the Year is a Leap Year or not a Leap
//Year.
//Hint =>
//1. The LeapYear program only works for year >= 1582, corresponding to a year in the Gregorian calendar.
//So ensure to check for the same.
//2. Further, the Leap Year is a Year divisible by 4 and not 100 unless it is divisible by 400. E.g. 1800 is not
//a Leap Year and 2000 is a Leap Year.
//3. Write code having multiple if else statements based on conditions provided above

import java.util.Scanner;

class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();

        if (year < 1582) {
            System.out.println("Not a valid year");
        } else if (year % 400 == 0) {
            System.out.println(year + " is a Leap Year");
        } else if (year % 100 == 0) {
            System.out.println(year + " is not a Leap Year");
        } else if (year % 4 == 0) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is not a Leap Year");
        }
    }
}
