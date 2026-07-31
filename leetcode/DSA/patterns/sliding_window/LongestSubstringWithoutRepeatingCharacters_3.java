package leetcode.DSA.patterns.sliding_window;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters_3 {
    public static void main(String[] args) {
        String s = "1R1T7";
        HashSet<Character> hashSet = new HashSet<>();
        int maxLength = 0;
        int length = 0;
        int left = 0;
        int right = 0;
        for (right = 0; right < s.length(); right++) {

            while (hashSet.contains(s.charAt(right))) {
                hashSet.remove(s.charAt(left));
                left++;
            }
            hashSet.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);

        }

        System.out.println(maxLength);
    }
}
