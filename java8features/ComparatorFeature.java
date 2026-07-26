package java8features;

import java.util.Arrays;

public class ComparatorFeature {
    public static void main(String[] args) {
        int[] array2 = {5, 6, 4, 7, 8};

        Arrays.stream(array2).boxed().sorted((a,b) -> b-a).forEach(System.out::print);
    }
}
