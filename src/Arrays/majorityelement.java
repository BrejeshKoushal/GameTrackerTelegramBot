package Arrays;

import java.util.HashMap;
import java.util.Map;

public class majorityelement {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,3,4};

    }
    public static int majorityElement(int[] nums){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            if(e.getValue()>nums.length/2){
                return e.getKey();
            }
        }
        return 0;
    }
}
