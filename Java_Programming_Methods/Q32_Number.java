import java.util.Arrays;

class Q32_NumberChecker {
    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    public static int[] getDigits(int num) {
        return String.valueOf(num).chars().map(c -> c - '0').toArray();
    }

    public static boolean isDuck(int[] digits) {
        for (int d : digits) if (d == 0) return true;
        return false;
    }

    public static boolean isArmstrong(int[] digits, int num) {
        int sum = 0, len = digits.length;
        for (int d : digits) sum += Math.pow(d, len);
        return sum == num;
    }

    public static boolean isHarshad(int[] digits, int num) {
        int sum = Arrays.stream(digits).sum();
        return num % sum == 0;
    }

    public static int[][] digitFrequency(int[] digits) {
        int[] freq = new int[10];
        for (int d : digits) freq[d]++;
        int[][] result = new int[10][2];
        for (int i = 0; i < 10; i++) {
            result[i][0] = i;
            result[i][1] = freq[i];
        }
        return result;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++)
            if (num % i == 0) return false;
        return true;
    }

    public static boolean isNeon(int num) {
        int square = num * num;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == num;
    }

    public static boolean isSpy(int[] digits) {
        int sum = 0, product = 1;
        for (int d : digits) {
            sum += d;
            product *= d;
        }
        return sum == product;
    }

    public static boolean isAutomorphic(int num) {
        int square = num * num;
        return String.valueOf(square).endsWith(String.valueOf(num));
    }

    public static boolean isBuzz(int num) {
        return num % 7 == 0 || num % 10 == 7;
    }

    public static int[] reverse(int[] digits) {
        int[] rev = digits.clone();
        for (int i = 0; i < rev.length / 2; i++) {
            int temp = rev[i];
            rev[i] = rev[rev.length - 1 - i];
            rev[rev.length - 1 - i] = temp;
        }
        return rev;
    }

    public static boolean isPalindrome(int[] digits) {
        return Arrays.equals(digits, reverse(digits));
    }
}
