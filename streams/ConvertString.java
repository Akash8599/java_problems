package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertString {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Akash", "Samayak", "Tejas");

         list.stream().map(String::toUpperCase).collect(Collectors.toList()).forEach(System.out::println);

    }
}
