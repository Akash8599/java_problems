package java8features;

public class BiConsumer {
    public static void main(String[] args) {
        java.util.function.BiConsumer<String, String> biConsumer = (a,b) -> System.out.println(a + b);
        biConsumer.accept("Akash", "Kamble");
    }
}
