import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int [] nums= new int[]{0,0,1,1,1,2,2,3,3,4};
        int currentElement = nums[0];
        int count = 1;
        int index = 1;

        for(int i =1; i<nums.length; i++){
            // for(int j = i; j<nums.length; j++){
            if(currentElement != nums[i] ){
                nums[index] = nums[i];
                count++;
                index++;
                currentElement = nums[i];
            }
            // }

        }

        System.out.println(Arrays.toString(nums));
        System.out.println(count);
    }
}
