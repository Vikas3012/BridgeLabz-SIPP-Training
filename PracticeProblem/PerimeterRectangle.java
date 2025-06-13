//Perimeter of a Rectangle
//Write a program to calculate the perimeter of a rectangle. Take the length
//and width as inputs and use the formula:
//Perimeter = 2 * (length + width).

import java.util.Scanner;

public class PerimeterRectangle {
    static public void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Rectangle : ");
        int length = sc.nextInt();
        
        System.out.println("Enter the width of Rectangle : ");
        int width = sc.nextInt();

        int Perimeter = 2 * (length + width);
        System.out.println("Parimeter of the Rectangle is  : "+Perimeter);
    }
}



