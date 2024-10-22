package algorithms;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        int target = 4;

        int start = 0;

        int end = arr.length-1;

        int result = 0;

        while(start<=end){

            int mid = start + (end-start)/2;

            if(target>arr[mid]){
                start = mid+1;
            }

            if(target<arr[mid]){
                end = mid-1;
            }

            if(target==arr[mid]){
                result= mid;
            }

        }


    }
}
