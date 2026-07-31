package common;

import java.util.Arrays;

public class LongestSequeneceInteger {
    public static void main(String[] args) {
        int [] arr = {100, 1, 4,3,2,4, 200};

        Arrays.sort(arr);

        int currentLength = 1;
        int maxLenth = 1;


        for(int i = 1; i< arr.length; i++){
            if(arr[i] == arr[i-1] +1){
                currentLength++;
            }

            else if(arr[i] != arr[i-1]) {
                maxLenth = Math.max(currentLength, maxLenth);
                currentLength = 1;
            }
        }

        System.out.println(Math.max(currentLength, maxLenth));
    }
}
