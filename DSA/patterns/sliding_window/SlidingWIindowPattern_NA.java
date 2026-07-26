package DSA.patterns.sliding_window;

import java.util.Arrays;


// Q.Maximum of all subarrays of size k
public class SlidingWIindowPattern_NA {
    public static void main(String[] args) {

        //        int [] arr = {2,3,1,2,4,3};
        int [] arr = {1,2,3,4,5,6,7,8};
        int k = 3;

        int [] res = new int[arr.length-k+1];

        int index = 0;

        //output {3,3,4,4}

        for(int i = 0; i<arr.length-k+1; i++){
            int max = arr[i];

            for(int j = i; j< i+k; j++){


                if(arr[j]>max){
                    max = arr[j];
                }

            }



            res[index] = max;
            index++;
            max = 0;
        }

        System.out.println(Arrays.toString(res));
    }
}

