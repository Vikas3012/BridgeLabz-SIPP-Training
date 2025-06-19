import java.util.Scanner;

public class Q2_Temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temp = sc.nextDouble();
        double windSpeed = sc.nextDouble();
        double result = calculateWindChill(temp, windSpeed);
        System.out.printf("Wind Chill Temperature: %.2f", result);
        sc.close();
    }

    public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + (0.6215 * temperature) - 35.75 * Math.pow(windSpeed, 0.16)
                + 0.4275 * temperature * Math.pow(windSpeed, 0.16);
    }
}