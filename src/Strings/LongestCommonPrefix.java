package Strings;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] str = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(str));
    }
    public static String longestCommonPrefix(String[] strs) {
        if(strs==null) return "";
        Arrays.sort(strs);
        char[] first = strs[0].toCharArray();
        StringBuilder ans = new StringBuilder();
        char[] last = strs[strs.length-1].toCharArray();
        for(int i = 0 ; i < first.length ;i++){
            if(first[i]!=last[i]) break;
            else ans.append(first[i]);
        }

        return ans.toString();

    }
}
