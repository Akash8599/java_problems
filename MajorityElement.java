import java.util.*;

public class MajorityElement {
    public static void main(String[] args) {

        int [] A = {3,3,4};
        Map<Integer,Integer> map = new Hashtable<>();

        for(int i = 0; i< A.length; i++){
            map.put(A[i],map.getOrDefault(A[i], 0) + 1);
        }

        int maxValue = 0;
        int maxCout = 0;

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()> maxCout){
                maxCout = entry.getValue();
                maxValue = entry.getKey();
            }

        }


        Set<Integer> hashSet = new TreeSet<>();
        hashSet.add(1);
        hashSet.add(1);
        hashSet.add(3);
        hashSet.add(null);
        hashSet.add(null);

        System.out.println(hashSet);


//        System.out.println(Math.sqrt(4));
        System.out.println(maxValue);
    }
}
