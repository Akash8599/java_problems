package leetcode.DSA.patterns.two_pointer_approach;

import java.util.HashSet;

public class TwoPointerApproach_3 {

    //Longest Substring Without Repeating Characters

    public static void main(String[] args) {
        String input = "au";

        //brute force

        int maxLen = 0;

        int i, j = 0;

        for (i = 0; i < input.length(); i++) {

            HashSet<Character> hashSet = new HashSet<>();


            for (j = i; j < input.length(); j++) {

                if (hashSet.contains(input.charAt(j))) {

//                    maxLen = Math.max(maxLen, j-i);
                    break;
                }

                maxLen = Math.max(maxLen, j - i + 1); // update here directly
                hashSet.add(input.charAt(j));
            }
        }
        System.out.println(maxLen);
    }
}
