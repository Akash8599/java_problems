import java.util.Arrays;

public class ArrayPartition {
    public static void main(String[] args) {


        int [] arr ={1,4,3,2};
        System.out.println(arrayPairSum(arr));
    }




    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);

        int sum = 0;

        for(int i =0; i<nums.length; i++){
            sum += nums[i];
            i++;
        }

        return sum;
    }
}
