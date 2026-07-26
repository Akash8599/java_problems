package algorithms;

import java.util.Arrays;

public class MergeSortExample {
    public static void mergeSort(int[] arr) {
        if (arr.length <= 1) return;

        // Step 1: Divide
        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);

        // Recursive calls
        mergeSort(left);
        mergeSort(right);

        // Step 2: Merge
        merge(arr, left, right);
    }

    private static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        // Compare and merge
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        // Add remaining elements
        while (i < left.length) arr[k++] = left[i++];
        while (j < right.length) arr[k++] = right[j++];
    }

    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr)); // Output: [3, 9, 10, 27, 38, 43, 82]
    }
}
