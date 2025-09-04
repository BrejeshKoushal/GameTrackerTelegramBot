package Practice;

import java.util.*;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
            Map<String,List<String>> map = new HashMap<>();
            for (int i = 0 ; i < strs.length;i++){
                String st = strs[i];
                char[] ch = st.toCharArray();
                Arrays.sort(ch);
                String s = String.valueOf(ch);
                if(!map.containsKey(s)){
                    List<String> list = new ArrayList<>();
                    list.add(strs[i]);
                    map.put(s,list);
                }
                else{
                    map.get(s).add(strs[i]);
                }
            }
            List<List<String>> list  = new ArrayList<>();
            for (Map.Entry<String,List<String>> e : map.entrySet() ){
                list.add(new ArrayList<>(e.getValue()));
            }
            return list;
        }
    public static void main(String[] args) {
        String[] st = {"eat","tea","tan","ate","nat","bat"};
        groupAnagrams(st);
    }
}
