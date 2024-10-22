import java.util.*;

public class SecondHighest {


    private  static  int secondLargest(int n, int[] arr){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i =0; i<n; i++){
            if(arr[i]> largest){
                secondLargest = largest;
                largest = arr[i];

            }
            else if(arr[i] > secondLargest && arr[i] < largest){
                secondLargest = arr[i];

            }


        }

        if(secondLargest !=Integer.MIN_VALUE){
            return secondLargest;
        }
        else{
            return -1;
        }
    }
    public static void main(String[] args) {
        int[] arr = {10 ,25, -12, -6, 20 ,20 };

        System.out.println(secondLargest(arr.length, arr));
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
        System.out.println(7%3);
        int [] ar = {1 ,3 ,6, 11,12 ,17};
        List<Integer> list = new ArrayList<>();

        // Iterate through the array
        for (Integer t : ar) {
            // Add each element into the list
            list.add(t);
        }
        Collections.rotate( list, 4);

        System.out.println(list);


        Hashtable<Integer, Integer> hashtable = new Hashtable<>();
//        hashtable.getV

        HashMap<Integer, Integer> hashMap = new HashMap<>();
//        for(Map.Entry m:hashMap.entrySet()){
//            m.getValue()
//            System.out.println(m.getKey()+" "+m.getValue());
//        }
    }
}
