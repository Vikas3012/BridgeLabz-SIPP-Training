import java.util.Scanner;

public class Q8_quotient_reminder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int divisor = sc.nextInt();
        int[] result = findRemainderAndQuotient(num, divisor);
        System.out.println("Quotient: " + result[0] + ", Remainder: " + result[1]);
        sc.close();
    }

    public static int[] findRemainderAndQuotient(int number, int divisor) {
        return new int[]{number / divisor, number % divisor};
    }
}