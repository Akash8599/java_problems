package streams;

import java.util.Arrays;

public class MaxLength {
    public static void main(String[] args) {
        String s ="Akash kamble Gokuldas";

        String [] arr = s.split(" ");

        String len = Arrays.stream(arr).sorted((a, b) -> b.length()-a.length()).findFirst().get();
        System.out.println(len);
    }
}
