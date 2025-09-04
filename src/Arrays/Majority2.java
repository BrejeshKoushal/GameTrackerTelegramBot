package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Majority2 {
    public static void main(String[] args) {
        int[] nums = {1};
        System.out.println(majorityElement(nums));
    }
    public static List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int n = nums.length/3;
        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            if(e.getValue()>n)
                list.add(e.getKey());
        }
        return list;
    }
}
