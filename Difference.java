import java.lang.reflect.Array;

public class Difference {

    public static int maxProductDifference(int[] nums) {
        int size = nums.length;
        int temp = 0;
        for(int i=0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){

                if(nums[i]>nums[j]){
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        int  minProd= nums[0]*nums[1];
        int maxProduct = nums[size-1]*nums[size-2];
        return maxProduct-minProd;
    }
    public static void main(String[] args) {

        int nums [] = {5,6,3,4,2};
        maxProductDifference(nums);
    }
}
