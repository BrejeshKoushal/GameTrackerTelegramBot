package SlidingWindowAndTwoPointers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s) {
       int i = 0 ;
        int j = 0;
        int[] hash = new int[256];
        Arrays.fill(hash,-1);
        int max = 0;
        int l = 0 ,r = 0;
        while(r<s.length()){
            char ch = s.charAt(r);
            if(hash[ch]!=-1) {
                if (hash[ch] >= l) {
                    l = hash[ch] + 1;
                }
            }
            int len =   r-l+1;
            max = Math.max(max,len);
            hash[ch]=r;
            r++;
        }

        return max;
    }
}
