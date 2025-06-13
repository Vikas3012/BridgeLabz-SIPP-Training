//4. Area of a Circle
//Write a program to calculate the area of a circle. Take the radius as input
//and use the formula:
//Area = π * radius^2.

import java.util.Scanner;

public class AreaOfCircle {
    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of circle : ");
        float radius = sc.nextFloat();

        float Area = (3.14F) * radius * radius;
        System.out.println("Area of circle : " +Area+"sq");
    }
}