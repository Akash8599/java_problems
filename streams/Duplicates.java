package streams;

import java.util.*;
import java.util.stream.Collectors;

public class Duplicates {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,3,3,5,6,7,2);
//        list.add(null);
//        List<String>  a = new ArrayList<>();
//        a.add("Ak");
//
//        a.add(null);
Integer e = new Integer(12);
Integer r = new Integer(12);

int c=10;
int b =10;

        System.out.println(e==r);  //false
        System.out.println(c==b);  //true

//        a.forEach(System.out::println);
//        Map<String, String> map = new Hashtable<>();
//
//        map.put("Ak", null);
//        map.forEach((c,b)  -> System.out.println(c + " " + b));

        list.stream().filter(a -> Collections.frequency(list, a) > 1)
                .collect(Collectors.toSet())
                .forEach(System.out::print);
//
//        list.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()))
//                .entrySet()
//                .stream()
//                .filter(a -> a.getValue()>1)
//                .map(Map.Entry::getKey)
//                .collect(Collectors.toList()).forEach(System.out::print);


    }
}
