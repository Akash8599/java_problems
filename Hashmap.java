import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Hashmap<I extends Number, I1 extends Number> {

    public static void main(String[] args) {
        HashMap<Integer, String> hashmap = new HashMap<>();
        hashmap.put(1,"Akash");

        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(1,"Akash");

        System.out.println(hashtable.get(1));
        System.out.println(hashmap.get(0));

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Akash");
        System.out.println(map.get(1));


    }
}
