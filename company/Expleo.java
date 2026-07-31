package company;/* Save this in a file called Main.java to compile and test it */

/* Do not add a package declaration */
import java.util.*;
import java.io.*;

/* DO NOT CHANGE ANYTHING ABOVE THIS LINE */
/* You may add any imports here, if you wish, but only from the
   standard library */

/* Do not add a namespace declaration */

public class Expleo {
    public static List<String> processData(ArrayList<String> lines) {
        /*
         * Modify this method to process `lines` as indicated
         * in the question. At the end, return a List containing the
         * appropriate values
         *
         * Please create appropriate classes, and use appropriate
         * data structures as necessary.
         *
         * Do not print anything in this method.
         *
         * Submit this entire program (not just this method)
         * as your answer
         */

        Map<String, Integer> storeMaxPrice = new HashMap<>();
        Map<String, Set<String>> storeCustomers = new HashMap<>();

        for (String line : lines) {
            String[] parts = line.split(", ");
            String customer = parts[0];
            String store = parts[1];
            int price = Integer.parseInt(parts[4].split(" ")[1]);

            if (!storeMaxPrice.containsKey(store) || price > storeMaxPrice.get(store)) {
                storeMaxPrice.put(store, price);
                storeCustomers.put(store, new HashSet<>(Collections.singletonList(customer)));
            } else if (price == storeMaxPrice.get(store)) {
                storeCustomers.get(store).add(customer);
            }
        }

        Set<String> result = new LinkedHashSet<>();
        for (String line : lines) {
            String customer = line.split(", ")[0];
            for (Set<String> customers : storeCustomers.values()) {
                if (customers.contains(customer)) {
                    result.add(customer);
                }
            }
        }

        return new ArrayList<>(result);
    }

    public static void main (String[] args) {
        ArrayList<String> inputData = new ArrayList<String>();
        String line;
        Scanner in = new Scanner(System.in);
        while(in.hasNextLine())
            inputData.add(in.nextLine());
        List<String> retVal = processData(inputData);
        PrintWriter output = new PrintWriter(System.out);
        for(String str: retVal)
            output.println(str);
        output.close();
    }
}
