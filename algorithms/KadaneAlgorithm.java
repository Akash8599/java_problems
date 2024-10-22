package algorithms;

public class KadaneAlgorithm {

    private static int maxSubArray(int[] arr){
        int curSUm = 0;
        int maxSUm = Integer.MIN_VALUE;

        for (int i = 0; i< arr.length; i++){
            curSUm = curSUm + arr[i];

            if (curSUm > maxSUm){
                maxSUm = curSUm;
            }

            if (curSUm < 0){
                curSUm = 0;
            }
        }
        return maxSUm;
    }
    public static void main(String[] args) {
        int [] arr= {-400};

        System.out.println(maxSubArray(arr));

    }
}
