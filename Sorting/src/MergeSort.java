public class MergeSort {

    // Main method to trigger the sort
    public static void sort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        // Allocate the temporary array once to achieve O(n) space complexity
        int[] temp = new int[arr.length];
        mergeSort(arr, temp, 0, arr.length - 1);
    }

    // The "Divide" phase
    private static void mergeSort(int[] arr, int[] temp, int left, int right) {
        if (left >= right) {
            return; // Base case: 1 element is already sorted
        }

        int mid = left + (right - left) / 2; // Prevents integer overflow

        // Recursively sort the left and right halves
        mergeSort(arr, temp, left, mid);
        mergeSort(arr, temp, mid + 1, right);

        // Combine the two sorted halves
        merge(arr, temp, left, mid, right);
    }

    // The "Conquer" (Merge) phase
    private static void merge(int[] arr, int[] temp, int left, int mid, int right) {
        // Copy the current segment to the temporary array
        for (int i = left; i <= right; i++) {
            temp[i] = arr[i];
        }

        int i = left;      // Pointer for the left sorted half
        int j = mid + 1;   // Pointer for the right sorted half
        int k = left;      // Pointer for the original array

        // Compare elements from both halves and merge them back in order
        while (i <= mid && j <= right) {
            if (temp[i] <= temp[j]) {
                arr[k++] = temp[i++]; // Stable sort: left element goes first if equal
            } else {
                arr[k++] = temp[j++];
            }
        }

        // Copy any remaining elements from the left half.
        // (We don't need to copy the right half because they are already in place)
        while (i <= mid) {
            arr[k++] = temp[i++];
        }
    }
}