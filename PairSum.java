public class PairSum {
    public static void main(String[] args) {
        System.out.println(pairSum(new int[]{1,2,3,4,5} ,5, 5));

    }


    public static int pairSum(int arr[], int n, int target) {
        // Write your code here.
        int left = 0;
        int right =n-1;

        int count = 0;

        while(left< right){
            int sum = arr[left] + arr[right];
            if(arr[left] + arr[right] == target){
                count++;

            }

            if(sum >target){
                right--;
            }
            else{
                left++;
            }

        }
        if(count ==0){
            return -1;
        }

        return count;
    }
}
