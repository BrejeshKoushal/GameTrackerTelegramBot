package Practice;

import java.util.Arrays;

public class LongestSubstring {
    public static void main(String[] args) {
        String s  = "avcddb";
        String t = "abc";
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        s = String.valueOf(ch);
        System.out.println(s);
        System.out.println(s.contains(t))   ;
    }
}
