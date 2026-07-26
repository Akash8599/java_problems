package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MaxValue {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,3,4,5,6,7,8);

//        Optional<Integer> max = list.stream().max(Comparator.naturalOrder());
//        max.ifPresent(System.out::println);
//        int max = list.stream().max(Integer::compare).get();
        Optional<Integer> max= list.stream().max((a,b) -> Integer.compare(a,b));
        max.ifPresent(System.out::println);

    }
}
