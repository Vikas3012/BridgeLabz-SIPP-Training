//CP - Write an IntOperation program by taking a, b, and c as input values and print the //results of the
//following integer operations a + b *c, a * b + c, c + a / b, and a % b + c. Please also //understand the
//Operator Precedence.
//Hint =>
//1. Create variables a, b, and c of int data type.
//2. Take user input for a, b, and c.
//3. Compute 3 integer operations and assign the result to a variable
//4. Finally, print the result and try to understand operator precedence.
//I/P => fee, discountPrecent
//O/P => The results of Int Operations are ___, ___, and ___

import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value for a: ");
        int a = input.nextInt();
        System.out.print("Enter value for b: ");
        int b = input.nextInt();
        System.out.print("Enter value for c: ");
        int c = input.nextInt();
        int result1 = a + b * c;
        int result2 = a * b + c;
        int result3 = c + a / b;
        int result4 = a % b + c;
        System.out.println("The results of Int Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4);
    }
}
