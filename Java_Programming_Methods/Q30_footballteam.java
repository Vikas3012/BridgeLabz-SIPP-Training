// Question 30
import java.util.Random;

public class Q30_footballteam {
    public static void main(String[] args) {
        int[] heights = new int[11];
        Random rand = new Random();
        for (int i = 0; i < heights.length; i++) {
            heights[i] = rand.nextInt(101) + 150; // Range 150-250
        }

        System.out.println("Heights of Players:");
        for (int height : heights) {
            System.out.print(height + " ");
        }

        System.out.println("\n\nMean Height: " + meanHeight(heights));
        System.out.println("Shortest Height: " + shortestHeight(heights));
        System.out.println("Tallest Height: " + tallestHeight(heights));
    }

    static int sum(int[] arr) {
        int total = 0;
        for (int num : arr) {
            total += num;
        }
        return total;
    }

    static double meanHeight(int[] arr) {
        return (double) sum(arr) / arr.length;
    }

    static int shortestHeight(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int num : arr) {
            if (num < min) min = num;
        }
        return min;
    }

    static int tallestHeight(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) max = num;
        }
        return max;
    }
}
