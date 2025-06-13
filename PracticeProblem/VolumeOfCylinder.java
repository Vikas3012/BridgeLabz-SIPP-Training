// Volume of a Cylinder
//        Write a program to calculate the volume of a cylinder. Take the radius and
//        height as inputs and use the formula:
//        Volume = π * radius^2 * height.

import java.util.Scanner;

public class VolumeOfCylinder {
    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of cyclinder : ");
        float radius = sc.nextFloat();
        
        System.out.println("Enter height of cyclinder : ");
        float height = sc.nextFloat();

        float volume = (3.14F) * (radius * radius) * height;
        System.out.println("Volume of cylinder is  : " +volume);
    }
}



