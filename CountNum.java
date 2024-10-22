import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountNum {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,3,1,2);
        Map<Integer, Long> fia = list.stream().collect(Collectors.groupingBy(num -> num, Collectors.counting() ));
        fia.forEach((num, count) -> System.out.println("Num" + num + "Count" + count));
    }


}
