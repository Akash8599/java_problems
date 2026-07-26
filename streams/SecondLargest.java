package streams;

import java.util.*;

public class SecondLargest {
    public static void main(String[] args) {
        int [] arr = {12, 35, 1, 10, 34, 1};

        int result = Arrays.stream(arr)
                .distinct()
                .boxed()
                .sorted(Comparator.reverseOrder()) // Sort in descending order
                .skip(1)                  // Skip the largest element
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("No second largest element found"));

        System.out.println(result);

    }
}
