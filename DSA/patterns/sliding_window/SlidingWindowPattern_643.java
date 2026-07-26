//package DSA.patterns.sliding_window;
//
//public class SlidingWindowPattern_643 {
//
//    public static void main(String[] args) {
//
//        int [] arr = {1,12,-5,-6,50,3};
//        int k = 4;
//
//        // brute force solution
////        int maxSumAvg = Integer.MIN_VALUE;
////       for (int i = 0; i<arr.length-k;i++){
////           int curSum = 0;
////           for(int j = i; j< i+k; j++){
////               curSum = curSum + arr[j];
////           }
////
////           maxSumAvg = Math.max(curSum, maxSumAvg);
////       }
////        System.out.println(maxSumAvg);
////        double fin = (double) maxSumAvg /k;
////        System.out.println(fin);
//
//
//        int windowSum = 0;
//        int maxSum = 0;
//
//
//        for(int i = 0; i< k; i++){
//            windowSum += arr[i];
//        }
//            // for single element
//         maxSum = windowSum;
//        for(int i = k; i< arr.length; i++){
//            windowSum = windowSum + arr[i] - arr[i-k];
//
//            maxSum = Math.max(windowSum, maxSum);
//        }
//
//        System.out.println((double) maxSum /k);
//    }
//}
