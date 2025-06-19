import java.util.Scanner;

public class Q7_sign{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = checkNumber(num);
        System.out.println("Result: " + result);
        sc.close();
    }

    public static int checkNumber(int number) {
        if (number > 0) return 1;
        else if (number < 0) return -1;
        else return 0;
    }
}