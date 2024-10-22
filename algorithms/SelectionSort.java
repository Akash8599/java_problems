package algorithms;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] data = { 5, 3, 4, 1, 2 };
        // call the method using class name
        selectionSort(data, data.length);

        System.out.println("Array sorted with bubble sort: ");
        System.out.println(Arrays.toString(data));
    }

    private static void selectionSort(int [] arr, int n) {


        // Write your code here.
        for (int i = 0; i < n - 1; i++) {

            int lowest = i;

            for (int j = i + 1; j < n; j++) {


                if (arr[lowest] > arr[j]) {

                    lowest = j;


                }

            }

            int temp = arr[lowest];
            arr[lowest] = arr[i];
            arr[i] = temp;

        }
    }
}
