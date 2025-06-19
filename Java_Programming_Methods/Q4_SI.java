import java.util.Scanner;

public class Q4_SI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double principal = sc.nextDouble();
        double rate = sc.nextDouble();
        double time = sc.nextDouble();
        double si = calculateSimpleInterest(principal, rate, time);
        System.out.printf("The Simple Interest is %.2f for Principal %.2f, Rate of Interest %.2f and Time %.2f",
                          si, principal, rate, time);
        sc.close();
    }

    public static double calculateSimpleInterest(double p, double r, double t) {
        return (p * r * t) / 100;
    }
}