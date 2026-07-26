package java8features;

import java.util.Arrays;
import java.util.function.Function;

public class FunctionFeature {
    public static void main(String[] args) {

        // it takes input aas well as return output
        Function<String, Integer> fun = f -> f.length();

        System.out.println(fun.apply("Akash"));

        int[] array2 = {4, 5, 6, 7, 8};


//        Arrays.stream(array2).boxed()

    }
}
