package java8features;

import java.util.function.Predicate;

public class PredicateFeature {
    public static void main(String[] args) {
        Predicate<String> pr = (a) -> a.equals("Akash");
        System.out.println(pr.test("Akash"));
    }
}
