import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountInt {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 3, 3, 5, 6, 7, 2);

        list.stream().collect(Collectors.groupingBy(a -> a, Collectors.counting())).entrySet().stream()
                .forEach(System.out::println);

//        Comparable
//        Comparator
        Integer a = 128;;
        Integer b = 128;
        System.out.println(a==b);

//        float c = 3.4f;
//        double d= c;
//        float e = d;

    }

}
