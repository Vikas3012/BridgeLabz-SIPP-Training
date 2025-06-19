import java.util.Scanner;

public class Q14_PosNegEvenOddCompare {
    public static boolean isPositive(int n) {
        return n >= 0;
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static int compare(int a, int b) {
        return Integer.compare(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];
        for (int i = 0; i < 5; i++) {
            nums[i] = sc.nextInt();
            if (isPositive(nums[i])) {
                System.out.print("Positive ");
                System.out.println(isEven(nums[i]) ? "Even" : "Odd");
            } else {
                System.out.println("Negative");
            }
        }

        int cmp = compare(nums[0], nums[4]);
        if (cmp == 0) System.out.println("First and Last are Equal");
        else if (cmp > 0) System.out.println("First is Greater");
        else System.out.println("Last is Greater");
    }
}
