public class Q34_NumberChecker {
    public static void main(String[] args) {
        int number = 7; // You can change this number to test other cases

        System.out.println("Number: " + number);

        System.out.println("Is Prime Number: " + NumberChecker.isPrime(number));
        System.out.println("Is Neon Number: " + NumberChecker.isNeon(number));
        System.out.println("Is Spy Number: " + NumberChecker.isSpy(number));
        System.out.println("Is Automorphic Number: " + NumberChecker.isAutomorphic(number));
        System.out.println("Is Buzz Number: " + NumberChecker.isBuzz(number));
    }
}

class NumberChecker {

    // 1. Check if prime number
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    // 2. Check if neon number
    public static boolean isNeon(int number) {
        int square = number * number;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == number;
    }

    // 3. Check if spy number
    public static boolean isSpy(int number) {
        int sum = 0, product = 1, n = number;
        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            product *= digit;
            n /= 10;
        }
        return sum == product;
    }

    // 4. Check if automorphic number
    public static boolean isAutomorphic(int number) {
        int square = number * number;
        return String.valueOf(square).endsWith(String.valueOf(number));
    }

    // 5. Check if buzz number
    public static boolean isBuzz(int number) {
        return number % 7 == 0 || number % 10 == 7;
    }
}
