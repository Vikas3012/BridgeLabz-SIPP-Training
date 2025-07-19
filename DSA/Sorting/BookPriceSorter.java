package sorting;

public class BookPriceSorter {

    // Recursive merge sort function
    public static void mergeSort(int[] prices, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            // Sort the left and right halves
            mergeSort(prices, left, mid);
            mergeSort(prices, mid + 1, right);

            // Merge sorted halves
            merge(prices, left, mid, right);
        }
    }

    // Merge two sorted subarrays
    public static void merge(int[] prices, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Create temporary arrays
        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; i++)
            leftArr[i] = prices[left + i];
        for (int j = 0; j < n2; j++)
            rightArr[j] = prices[mid + 1 + j];

        // Merge temp arrays
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                prices[k++] = leftArr[i++];
            } else {
                prices[k++] = rightArr[j++];
            }
        }

        // Copy remaining elements
        while (i < n1)
            prices[k++] = leftArr[i++];
        while (j < n2)
            prices[k++] = rightArr[j++];
    }

    // Helper to print array
    public static void printArray(int[] prices) {
        for (int price : prices) {
            System.out.print(price + " ");
        }
        System.out.println();
    }

    // Test run
    public static void main(String[] args) {
        int[] bookPrices = {450, 299, 150, 620, 500, 200};

        System.out.println("Original Book Prices:");
        printArray(bookPrices);

        mergeSort(bookPrices, 0, bookPrices.length - 1);

        System.out.println("Sorted Book Prices (Ascending):");
        printArray(bookPrices);
    }
}