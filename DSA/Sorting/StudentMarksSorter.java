package sorting;

public class StudentMarksSorter {
    public static void bubbleSort(int[] marks) {
        int n = marks.length;
        boolean swapped;

        // Outer loop for passes
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Inner loop for pairwise comparisons
            for (int j = 0; j < n - i - 1; j++) {
                if (marks[j] > marks[j + 1]) {
                    // Swap marks[j] and marks[j + 1]
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no swaps in this pass, array is sorted
            if (!swapped)
                break;
        }
    }

    // Utility function to print array
    public static void printArray(int[] marks) {
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println();
    }

    // Main method to test
    public static void main(String[] args) {
        int[] studentMarks = {85, 67, 90, 78, 56};

        System.out.println("Original Marks:");
        printArray(studentMarks);

        bubbleSort(studentMarks);

        System.out.println("Sorted Marks (Ascending):");
        printArray(studentMarks);
    }
}