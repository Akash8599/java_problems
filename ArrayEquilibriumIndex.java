//You are given an array Arr consisting of N integers. You need to find the equilibrium index of the array.
// An index is considered as an equilibrium index if the sum of elements of the array to the left of that index is equal to the sum of elements to the right of it.
//codingNinjas

public class ArrayEquilibriumIndex {
    public static void main(String[] args) {
        System.out.println(arrayEquilibriumIndex(new int[]{1, 7, 3, 6, 5, 6}));
    }

    public static int arrayEquilibriumIndex(int[] arr){
        //Your code goes here

        int totalSum = 0;
        for(int i = 0; i< arr.length; i++){
            totalSum+=arr[i];
        }
        int leftSum=0;

        for(int i = 0; i< arr.length; i++){
            int rightSum = totalSum-leftSum;

            if(rightSum==leftSum){
                return i;
            }

            leftSum+=arr[i];
        }

        return -1;

    }
}
