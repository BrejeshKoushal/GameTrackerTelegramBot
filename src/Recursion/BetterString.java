package Recursion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BetterString {
    public static void main(String[] args) {
//str1 = "gfg", str2 = "ggg"
//Output: "gfg"
//Explanation: "gfg" have 6 distinct subsequences whereas "ggg" have 3 distinct subsequences.
        String str1 = "gfg";
        String str2 = "ggg";
        System.out.println(betterString(str1, str2));
    }

    public static String betterString(String str1, String str2) {
        int count1 = count(str1);
        int count2 = count(str2);
        if(count1>count2){
            return str1;
        }
        else return str2;
    }
    public static int count(String str){
        Set<String> set = new HashSet<>();
        recursion(str,set,"",0);
        return set.size();
    }

    public static void recursion(String str, Set<String> set, String s, int index) {
        if (index == str.length()) {
            set.add(s);
            return;
        }
        recursion(str, set, s+str.charAt(index), index + 1);
        recursion(str, set, s, index + 1);

    }
    }