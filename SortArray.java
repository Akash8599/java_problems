public class SortArray {

    public static int[] sortArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // Move left pointer until it points to 1
            while (arr[left] == 0 && left < right) {
                left++;
            }

            // Move right pointer until it points to 0
            while (arr[right] == 1 && left < right) {
                right--;
            }

            if (left < right) {
                // Swap elements at left and right pointers
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 1, 0, 1, 0};
        System.out.print("Original array: ");
        printArray(arr);

        int[] sortedArr = sortArray(arr);
        System.out.print("Sorted array: ");
        printArray(sortedArr);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
