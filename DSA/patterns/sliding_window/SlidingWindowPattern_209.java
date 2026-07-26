package DSA.patterns.sliding_window;

import java.util.Arrays;

public class SlidingWindowPattern_209 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 2, 4, 3};
        int target = 7;

        int minLen = Integer.MAX_VALUE;

        int start = 0;
        int end = 0;

        // Brute force approach: try all possible subarrays
        for (int i = 0; i < arr.length; i++) {
            // Initialize the sum of the current subarray to 0
            int sum = 0;

            // Expand the subarray to the right
            for (int j = i; j < arr.length; j++) {
                // Add the current element to the sum
                sum = sum + arr[j];

                // If the sum is greater than or equal to the target, update the minimum length
                if (sum >= target) {
                    // Update the minimum length
                    minLen = Math.min(minLen, j - i + 1);
                    // Break out of the inner loop since we've found a valid subarray
                    break;
                }
            }
        }
        System.out.println(minLen);


        // efficient solution
        int high = 0;
        int low = 0;

        int minimumLen = Integer.MAX_VALUE;
        int windowSum = 0;

        for (high = 0; high < arr.length; high++) {
            windowSum += arr[high];

            while (windowSum >= target) {
                int windowSize = high - low + 1;

                minimumLen = Math.min(minimumLen, windowSize);

                windowSum = windowSum - arr[low];

                low++;
            }
        }

        System.out.println(minimumLen);
    }
}


