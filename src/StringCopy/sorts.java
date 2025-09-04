package StringCopy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class sorts {
    public static void main(String[] args) {
        String str = "vbbcccaa";
        sort(str);
        System.out.println(str);
    }
    public static void sort(String str){
            Map<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < str.length(); i++) {
                map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
            }
            List<Map.Entry<Character, Integer>> mp = new ArrayList<>(map.entrySet());
            mp.sort((a,b) -> b.getValue() - a.getValue());

            System.out.println(mp);
        }
    }