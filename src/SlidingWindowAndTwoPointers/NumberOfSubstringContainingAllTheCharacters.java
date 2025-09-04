package SlidingWindowAndTwoPointers;

import java.util.HashMap;

public class NumberOfSubstringContainingAllTheCharacters {
    public static void main(String[] args) {
        String s = "abcabc";
        System.out.println(numberOfSubstrings(s));

    }
    public static  int numberOfSubstrings(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int i = 0 ;
        int j = 0;
        int  sum = 0;
        while(j<s.length()) {
            map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
            while (map.size() >= 3) {
                map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
                if (map.get(s.charAt(i)) == 0) {
                    map.remove(s.charAt(i));
                }
                i++;
                sum += s.length() - j;
            }
                j++;
            }
        return sum;
    }
}
