public class RemoveElemnt {
    public static void main(String[] args) {
        int [] nums = {3,2,2,3};
        int val = 3;

        System.out.println(removeElement(nums, val));
    }
    private static int removeElement(int[] nums, int val){
        int count = 0;

        for(int i = 0; i<nums.length; i++){
            if(nums[i] != val){
                int temp = nums[i];
                nums[count] = nums[i];
                nums[i] = temp;
                count++;
            }


        }
        return count;
    }
}
