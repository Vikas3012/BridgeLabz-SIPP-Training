import java.util.Arrays;
import java.util.Random;

public class SearchComparison {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }
    public static int binarySearch(int[] arr, int target) {
        return Arrays.binarySearch(arr, target);
    }

    public static int[] generateRandomArray(int size) {
        Random rand = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++)
            arr[i] = rand.nextInt(size * 10);
        return arr;
    }
    public static void main(String[] args) {
        int[] sizes = {1000, 10000, 1000000};
        for (int size : sizes) {
            System.out.println("Dataset Size: " + size);
            int[] data = generateRandomArray(size);
            int target = data[size / 2];

            long start = System.nanoTime();
            linearSearch(data, target);
            long end = System.nanoTime();
            double linearTime = (end - start) / 1e6;
            System.out.printf("Linear Search Time: %.4f ms%n", linearTime);
            Arrays.sort(data);
            start = System.nanoTime();
            binarySearch(data, target);
            end = System.nanoTime();
            double binaryTime = (end - start) / 1e6;
            System.out.printf("Binary Search Time: %.4f ms%n", binaryTime);
            System.out.println("-------------------------");
        }
    }
}