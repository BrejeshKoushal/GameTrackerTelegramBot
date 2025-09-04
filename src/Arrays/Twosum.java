package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Twosum {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        System.out.println(Arrays.toString(twosum(arr, 9)));

    }
    public static int[] twosum(int[] nums , int target){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i< nums.length ; i++){
            map.put(nums[i],i);
        }
        for(int i = 0;i<nums.length;i++){
            int second_one = target - nums[i];
            if(map.containsKey(second_one)&&map.get(second_one)!=i){
                return new int[]{i,map.get(second_one)};
            }
        }
        return new int[]{-1, -1};
    }
}
