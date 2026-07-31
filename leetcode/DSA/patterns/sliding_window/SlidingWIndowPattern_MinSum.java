package leetcode.DSA.patterns.sliding_window;

public class SlidingWIndowPattern_MinSum {
    public static void main(String[] args) {

        int[] arr = {4, 3, 2, 1, 5};

        int k = 2;
        int n = arr.length;
        int windowSum = 0;

        int minSum = Integer.MAX_VALUE;

        int low = 0;

        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        minSum = windowSum;

        System.out.println(minSum);

        for (int i = k; i < n - k + 1; i++) {
            windowSum = windowSum + arr[i] - arr[low];

            low++;

            minSum = Math.min(windowSum, minSum);
        }

        System.out.println(minSum);
    }
}
