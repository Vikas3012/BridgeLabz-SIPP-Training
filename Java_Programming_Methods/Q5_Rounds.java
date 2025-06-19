import java.util.Scanner;

public class Q5_Rounds{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double rounds = calculateRounds(a, b, c);
        System.out.printf("Number of rounds to complete 5km: %.2f", rounds);
        sc.close();
    }

    public static double calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        return 5000 / perimeter;
    }
}