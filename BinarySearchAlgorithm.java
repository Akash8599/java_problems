public class BinarySearchAlgorithm {

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};

        int k = 5;

        System.out.println(binarySearch(arr, k));
    }

    private static int binarySearch(int[] arr, int k){

        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = (start+end)/2;

            int number = arr[mid];

            if (k > number){
                start = mid +1;
            }
             if(k< number){
                end = mid - 1;
            }

             if (k == mid){
                return mid;
            }
        }

        return -1;

    }
}
