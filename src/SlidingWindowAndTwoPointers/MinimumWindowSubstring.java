package SlidingWindowAndTwoPointers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {
    public static void main(String[] args) {
        String s = "a";
        String t = "aa";
        System.out.println(minWindow(s,t));
    }
    public static String minWindow(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0 ; i < t.length() ; i++){
            map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)+1);
        }
        int left = 0;
        int right = 0;
        int minLen = Integer.MAX_VALUE;
        int startPoint = -1;
        int count = 0;
        while(right<s.length()){
            if(map.containsKey(s.charAt(right))&&map.get(s.charAt(right))>0) count++;
            map.put(s.charAt(right),map.getOrDefault(s.charAt(right),0)-1);
            while(count==t.length()){
                if(right-left+1 < minLen) {
                    minLen = right-left+1;
                    startPoint = left;
                }
                map.put(s.charAt(left),map.get(s.charAt(left))+1);
                if(map.get(s.charAt(left))>0) count--;
                left++;
            }
            right++;
        }
        return startPoint==-1?"": s.substring(startPoint,minLen+startPoint);
    }
}
