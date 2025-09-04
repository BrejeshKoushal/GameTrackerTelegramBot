package Strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public  void main(String[] args) {
        String s = "aacc";
        String t = "ccac";
        System.out.println(isAnagram(s,t));
    }
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Integer> map = new HashMap<>();
        char[] main = s.toCharArray();
        char[] converted = t.toCharArray();
        for (int i = 0; i < main.length; i++) {
            map.put(main[i], map.getOrDefault(main[i], 0) + 1);
        }
        for (int i = 0; i < converted.length; i++) {
            Arrays.sort(converted);

            if (!map.containsKey(converted[i])){
                return false;
            }
        }

        return true;
    }
}
