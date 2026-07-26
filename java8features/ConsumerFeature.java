package java8features;

import java.util.function.Consumer;

public class ConsumerFeature {
    public static void main(String[] args) {
        Consumer<String> con = (a) -> System.out.println(a);

        con.accept("Akash");
    }
}
