import java.util.ArrayList;

public class Q28_FactorUtils {

    public static int[] getFactors(int n) {
        ArrayList<Integer> factors = new ArrayList<>();
        for (int i = 1; i <= n; i++)
            if (n % i == 0) factors.add(i);
        return factors.stream().mapToInt(i -> i).toArray();
    }

    public static int getGreatestFactor(int[] factors) {
        int max = 0;
        for (int f : factors) if (f > max) max = f;
        return max;
    }

    public static int getSum(int[] factors) {
        int sum = 0;
        for (int f : factors) sum += f;
        return sum;
    }

    public static long getProduct(int[] factors) {
        long prod = 1;
        for (int f : factors) prod *= f;
        return prod;
    }

    public static long getCubeProduct(int[] factors) {
        long prod = 1;
        for (int f : factors) prod *= Math.pow(f, 3);
        return prod;
    }
}
