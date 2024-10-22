import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RorrteArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(rotate(arr, 3)));
    }

    public static int[] rotate(int[] arr, int k) {
        k = k%arr.length;
        List<Integer> list = new ArrayList<>();

        for(int i = k; i<arr.length; i++){
            list.add(arr[i]);
        }

        for(int i = 0; i<k; i++){
            list.add(arr[i]);
        }
        for (int i = 0; i < list.size(); i++)
            arr[i] = list.get(i);

        return arr;
    }
}
