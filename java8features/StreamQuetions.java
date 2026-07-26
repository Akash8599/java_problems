package java8features;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamQuetions {
    public static void main(String[] args) {

        int[] array2 = {5, 6, 4, 7,8, 8};
        System.out.println(findMaxvalue(array2));



        List<String> words = Arrays.asList("apple", "banana", "cherry", "avocado");
        getGroupingElements(words).entrySet().stream().forEach(System.out::println);

        System.out.println(findSecondHighest(array2));

        List<String> list = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
        System.out.println(getCountElements(list));


        //Find the First Non-Repeating Character in a String

        String input = "swiss";
        System.out.println(getFirstNonRepeatingChar(input));

//        Find the Longest Word in a List
        List<String> words2 = Arrays.asList("apple", "banana", "kiwi", "strawberry", "blueberry");
        System.out.println(longestString(words2));

        // Flatten a List of Lists Using Streams
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8, 9)
        );

        System.out.println(flattenList(listOfLists));
    }

    private static String getFirstNonRepeatingChar(String s){

        String[] ch = s.split("");


        char output =  s.chars().mapToObj(c-> (char) c)
                 .collect(Collectors.groupingBy(a -> a, Collectors.counting()))
                 .entrySet()
                 .stream()
                 .filter(x -> x.getValue()==1)
                 .map(Map.Entry::getKey)
                 .findFirst()
                 .get();

        return Arrays.stream(ch).collect(Collectors.groupingBy(a -> a, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x -> x.getValue()==1)
                .map(Map.Entry::getKey)
                .findFirst()
                .get();



    }
    private static Map<Character, List<String>> getGroupingElements(List<String>  list){
        return list.stream().collect(Collectors.groupingBy(x -> x.charAt(0)));
    }

    private static String longestString(List<String>  list){
        return list.stream().max(Comparator.comparingInt(String::length)).orElse(null);
    }

    private static List<Integer> flattenList(List<List<Integer>> list){
        return list.stream().flatMap(List::stream)
                .collect(Collectors.toList());
    }

    private static int findMaxvalue(int[] arr) {

       return Arrays.stream(arr).max().orElse(-1);
    }


    private static int findSecondHighest(int[] arr) {

        return Arrays.stream(arr).boxed().distinct().sorted((x,y) -> y-x).skip(1).findFirst().get();
    }
    private static Map<String, Long> getCountElements(List<String>  list){
        return list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }


}
