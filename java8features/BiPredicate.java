package java8features;

public class BiPredicate {
    public static void main(String[] args) {
        java.util.function.BiPredicate<Integer, Integer> biPredicate = (a,b) -> a.equals(b);
        System.out.println(biPredicate.test(5,5));
    }
}
