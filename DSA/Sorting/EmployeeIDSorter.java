package sorting;

public class EmployeeIDSorter {

    // Core insertion-sort routine
    public static void insertionSort(int[] ids) {
        int n = ids.length;

        for (int i = 1; i < n; i++) {
            int key = ids[i];      // Element to be positioned
            int j = i - 1;

            // Shift elements of the sorted part that are greater than key
            while (j >= 0 && ids[j] > key) {
                ids[j + 1] = ids[j];
                j--;
            }

            // Place key at its correct position
            ids[j + 1] = key;
        }
    }

    // Helper to display the array
    public static void printArray(int[] ids) {
        for (int id : ids) {
            System.out.print(id + " ");
        }
        System.out.println();
    }

    // Quick demo
    public static void main(String[] args) {
        int[] employeeIDs = {1007, 1001, 1010, 1004, 1002};

        System.out.println("Original IDs:");
        printArray(employeeIDs);

        insertionSort(employeeIDs);

        System.out.println("Sorted IDs (Ascending):");
        printArray(employeeIDs);
    }
}