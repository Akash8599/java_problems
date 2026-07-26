/* Save this in a file called Main.java to compile and test it */

/* Do not add a package declaration */
import java.util.*;
import java.io.*;

/* You may add any imports here, if you wish, but only from the
   standard library */

public class Main {
    public static int processArray(ArrayList<Integer> array) {
        /*
         * Modify this function to process `array` as indicated
         * in the question. At the end, return the appropriate
         * value.
         *
         * Please create appropriate classes, and use appropriate
         * data structures as necessary.
         *
         * Do not print anything in this method
         *
         * Submit this entire program (not just this function)
         * as your answer
         */

        int count = 0;
        for(int i =0;i<array.size();i++){
            if(array.get(i)%2==0){
                int sum =0;
                int j =i;
                while(j<array.size() && array.get(j)%2==0){
                    sum+=array.get(j);
                    if(  ((j+1)>=array.size() || array.get(j+1)%2!=0) && sum>=20){
                        count++;
                        break;
                    }
                    j++;
                }
            }
        }
        return count;
    }

    public static void main (String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        while(in.hasNextInt()) {
            int num = in.nextInt();
            if (num < 0)
                break;
            arrayList.add(new Integer(num));
        }
        int result = processArray(arrayList);
        System.out.println(result);
    }
}
