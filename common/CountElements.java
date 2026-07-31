package common;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class CountElements {

    public static void main(String[] args) {
        int [] a ={1,2,3,44,5,5,6,6,7,1,2,4,5};

        Map<Integer, Long> collect = Arrays.stream(a).boxed()
                .collect(Collectors.groupingBy(b -> b, Collectors.counting()));
        collect.toString();
        System.out.println(collect);
    }
}
