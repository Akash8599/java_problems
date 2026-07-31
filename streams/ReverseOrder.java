package streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseOrder {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,3,3,5,6,7,2);
         list.stream().sorted(Collections.reverseOrder())
                 .collect(Collectors.toList())
                 .forEach(System.out::print);
    }
}
