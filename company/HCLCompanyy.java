package company;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class HCLCompanyy {
    public static void main(String[] args) {
        int [] arr = {1,2,3,1,4,2,2,5} ;
//        output: 1:2; 2:3; 3:1; 4:1; 5:1



        Map<Integer, Long> map =   Arrays.stream(arr)
                .boxed().collect(Collectors.groupingBy(a-> a, Collectors.counting()));

        map.forEach((a, b) -> System.out.print(a + ":" + b + " "));
    }
}
