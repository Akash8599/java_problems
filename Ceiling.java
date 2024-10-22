public class Ceiling {
    public static void main(String[] args) {

        int [] nums = {1,3,5,6};


        int []  nums1 = new int[nums.length];

        System.out.println(cieling(nums));
    }

    private static int cieling(int[] nums){
        int start = 0;
        int end = nums.length-1;
        int target = 7;

        if (target> nums[end]){
            return end+1;
        }

        int outer = target - nums[end];
        int outer1 = outer + end+1;
        while(start<=end){
            int mid = start + (end-start)/2;

            if(target<nums[mid]){
                end = mid-1;
            }

            if(target>nums[mid]){
                start = mid+1;

            }

            if(target == nums[mid]){
                return mid;
            }


        }

        return outer1;
    }
}
