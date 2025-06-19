import java.util.Scanner;

public class Q23_Quadratic {
    public static void findRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Two Roots: " + root1 + ", " + root2);
        } else if (delta == 0) {
            double root = -b / (2 * a);
            System.out.println("One Root: " + root);
        } else {
            System.out.println("No real roots.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
        findRoots(a, b, c);
    }
}
