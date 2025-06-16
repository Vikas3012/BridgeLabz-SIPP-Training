//Question 30
//CP - Write a program DayOfWeek that takes a date as input and prints the day of the week that the date falls
//on.
//Hint =>
//1. The program should take three command-line arguments: m (month), d (day), and y (year). For m use
//1 for January, 2 for February, and so forth.
//2. For output print 0 for Sunday, 1 for Monday, 2 for Tuesday, and so forth.
//3. Use the following formulas, for the Gregorian calendar (where / denotes integer division):


import java.util.Scanner;

class DayWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int d = input.nextInt();
        int y = input.nextInt();

        if (m < 3) {
            m += 12;
            y--;
        }
        int k = y % 100;
        int j = y / 100;

        int dayOfWeek = (d + 13*(m + 1)/5 + k + k/4 + j/4 + 5*j) % 7;
        System.out.println("Day of week is: " + dayOfWeek);
    }
}
