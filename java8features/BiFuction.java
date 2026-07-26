package java8features;

import java.util.function.BiFunction;

public class BiFuction {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> biFuction =  (a, b) -> a+b;

        System.out.println(biFuction.apply(5,5));
    }
}
