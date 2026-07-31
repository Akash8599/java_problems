package company;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Impetus {
    public static void main(String[] args) {
        String input = "dog jumping again jumping again jumping again jumping over dog";

        String[] arr = input.split(" ");

        Arrays.stream(arr).collect(Collectors.groupingBy(word -> word, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted((a,b) -> Math.toIntExact(b.getValue() - a.getValue()))
                .collect(Collectors.toList()).forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue() ));


    }
}
