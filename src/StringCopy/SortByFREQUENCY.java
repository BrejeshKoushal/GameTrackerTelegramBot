package StringCopy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortByFREQUENCY {
    public static void main(String[] args) {

    }
    public String frequencySort(String s){
        HashMap<Character,Integer> FrequencyMap = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            FrequencyMap.put(s.charAt(i),FrequencyMap.getOrDefault(s.charAt(i),0)+1);
        }
       List<Map.Entry<Character,Integer>> sortingList = new ArrayList<>(FrequencyMap.entrySet());
        sortingList.sort((a,b)->b.getValue()-a.getValue());
        StringBuilder ans = new StringBuilder();
        for(Map.Entry<Character,Integer> e :sortingList){
            int frequency = e.getValue();
            char c = e.getKey();
            for(int i = 0;i<frequency;i++){
                ans.append(c);
            }
        }
        return ans.toString();
    }
}
