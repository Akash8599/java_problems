package common;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaFunction {

    public static void main(String[] args) {
         List<Integer> list = Arrays.asList(1,2,3,4,3,1,2);

        List<Integer> oddlist = list.stream().filter(m -> m%2 != 0).collect(Collectors.toList());

        System.out.println(oddlist);

        List<Integer> uniqueList = list.stream().distinct().collect(Collectors.toList());

        System.out.println(uniqueList);

        StringBuffer sb = new StringBuffer("Hello World");
        System.out.println(sb.reverse());

        StringBuilder sb1 = new StringBuilder("Hello World");
        System.out.println(sb1.reverse());

        String s = "Hellow";
        String a= s.concat("world");
        s= s.concat("world");

        System.out.println(s);
        System.out.println(a);




    }
}
