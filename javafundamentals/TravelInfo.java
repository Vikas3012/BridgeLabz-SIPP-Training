//CP - Rewrite the Sample Program 2 with user inputs
//Hint =>
//1. Create variables and take user inputs for name, fromCity, viaCity, toCity
//2. Create variables and take user inputs for distances fromToVia and viaToFinalCity in //Miles
//3. Create Variables and take user input for the time taken: From City to Via City and Via //City to Final
//Destination
//4. Finally, print the result and try to understand operator precedence.
//I/P => name, fromCity, viaCity, toCity, fromToVia, viaToFinalCity, timeFromToVia, //timeViaToFinalCity
//O/P => The Total Distance travelled by ___ from ___ to ___ via ___ is ___ km and the Total //Time taken
//is ___ minutes     

import java.util.Scanner;

public class TravelInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.print("Enter From City: ");
        String fromCity = input.nextLine();
        System.out.print("Enter Via City: ");
        String viaCity = input.nextLine();
        System.out.print("Enter To City: ");
        String toCity = input.nextLine();
        System.out.print("Enter distance from " + fromCity + " to " + viaCity + " in miles: ");
        double fromToVia = input.nextDouble();
        System.out.print("Enter distance from " + viaCity + " to " + toCity + " in miles: ");
        double viaToFinalCity = input.nextDouble();
        System.out.print("Enter time taken from " + fromCity + " to " + viaCity + " in minutes: ");
        double timeFromToVia = input.nextDouble();
        System.out.print("Enter time taken from " + viaCity + " to " + toCity + " in minutes: ");
        double timeViaToFinalCity = input.nextDouble();
        double totalDistanceKm = (fromToVia + viaToFinalCity) * 1.6;
        double totalTime = timeFromToVia + timeViaToFinalCity;
        System.out.println("The Total Distance travelled by " + name + " from " + fromCity + " to " + toCity +
                           " via " + viaCity + " is " + totalDistanceKm + " km and the Total Time taken is " +
                           totalTime + " minutes");
    }
}
