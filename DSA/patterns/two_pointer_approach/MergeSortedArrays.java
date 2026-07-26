package DSA.patterns.two_pointer_approach;

import java.util.Arrays;

public class MergeSortedArrays {

    public static void main(String[] args) {
        int nums1 [] = {1,2,3};
        int nums2 [] = {2,3,5};

        int left =0;
        int right =0;

        int [] res = new int[nums1.length+ nums2.length];

        for (int i = 0; i< nums1.length + nums2.length; i++){

            if(nums1[left]< nums2[right]){
                res[i]= nums1[left];
                left++;
            }

            else {
                res[i]= nums2[right];
                right++;
            }
        }

        System.out.println(Arrays.toString(res));
    }
}
