package common;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TwoArrayDuplicates {
    public static void main(String[] args) {

        System.out.println(8%3);
        System.out.println(1.0/3);

        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};

        List<Integer> l1 = Arrays.stream(array1).boxed().collect(Collectors.toList());
        List<Integer> l2 = Arrays.stream(array2).boxed().collect(Collectors.toList());

        List<Integer> finalList = l1.stream()
                .filter(l2::contains)
                .collect(Collectors.toList());

        String a = "Akash";
        String []  ch = a.split("");

        Arrays.stream(ch).forEach(System.out::print);
    }
}
