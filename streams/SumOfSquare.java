package streams;

import java.util.Arrays;
import java.util.List;

public class SumOfSquare {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4);


        int sum = list.stream()
                .filter(a -> a%2==0)
                .map(b -> b*b)
                .reduce(1, Integer::max);
        System.out.println(sum);
    }
}
