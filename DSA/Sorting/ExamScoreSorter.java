package sorting;

public class ExamScoreSorter {

    /** Selection-sort routine (ascending) */
    public static void selectionSort(int[] scores) {
        int n = scores.length;

        // Move the boundary of the unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;   // Assume current i is the minimum

            // Find the index of the minimum element in the remainder
            for (int j = i + 1; j < n; j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap if the minimum is not already at position i
            if (minIndex != i) {
                int temp = scores[i];
                scores[i] = scores[minIndex];
                scores[minIndex] = temp;
            }
        }
    }

    /** Utility to print the array */
    public static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    /** Demo run */
    public static void main(String[] args) {
        int[] examScores = {72, 88, 95, 63, 84, 77};

        System.out.println("Original Scores:");
        printArray(examScores);

        selectionSort(examScores);

        System.out.println("Sorted Scores (Ascending):");
        printArray(examScores);
    }
}