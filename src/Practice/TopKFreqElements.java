package Practice;

import java.util.*;
import java.util.stream.Collectors;

public class TopKFreqElements {
    public static  List<Integer> getTopK(Map<Integer, Integer> map, int k) {
        return map.entrySet()
                .stream()
                .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
                .limit(k)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new LinkedHashMap<>();
        for (int i = 0 ; i < nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<Integer> list =  getTopK(map,k);
        int[]arr = new int[list.size()];
        for (int i = 0 ; i < list.size();i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] nums = {1};
        int k = 1 ;
        System.out.println(Arrays.toString(topKFrequent(nums, k)));
    }
}
