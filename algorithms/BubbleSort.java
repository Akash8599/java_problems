package algorithms;

import java.util.Arrays;

public class BubbleSort {

    static void bubbleSort(int [] data){
        int size = data.length;

        for(int i = 0; i<size-1; i++){
            for (int j = 0; j< size -i -1 ; j++){
                if(data [j] > data[j+1] ){
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }

            }
        }

    }
    public static void main(String[] args) {
        int[] arr = {10 ,25, -12, -6, 20 ,20 };
//        -12,14,-15,-17, 20
        // call the method using class name
//        bubbleSort(data);

        Arrays.sort(arr);
        int result = 0;

        for(int i = arr.length-2; i>=0; i--){
            if(arr[i] !=arr[i-1] && arr[i+1] != arr[i]){
                result= arr[i];
                break;
            }
            else{
                result = arr[i-1];
            }
        }

        System.out.println("Array sorted with bubble sort: ");
        System.out.println(Arrays.toString(arr));
        System.out.println(result);
    }
}
