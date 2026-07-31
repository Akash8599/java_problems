package common;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FunctionalInterfaceClass {

    public static void main(String[] args) {
        FunctionalnterfaceTest f = data -> System.out.println("Method called " + data);

        f.method(1);


        // Using Consumer with a List
        List<String> messages = Arrays.asList("Hello", "World", "Java", "Hi");
//        String a = "ABC";
//        Consumer<String> c = data -> System.out.println(data);
//
//        messages.forEach(c);

        Consumer<String> c = data -> System.out.println(data);

        Predicate<String> p = data -> data.startsWith("H");

        messages.stream().filter(p)
                .forEach(c);
    }

}
