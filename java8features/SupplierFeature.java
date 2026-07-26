package java8features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class SupplierFeature {
    public static void main(String[] args) {

        List<Integer>  list = Arrays.asList(1,3,4,5,6,7);

        Supplier<Integer> supplier = () -> 100;

        Predicate<Integer>  pr = (a) -> a==100;

        Consumer<Integer> con = (b) -> System.out.println(b*8);

        if (pr.test(supplier.get())){
            con.accept(supplier.get());
        }




    }
}
