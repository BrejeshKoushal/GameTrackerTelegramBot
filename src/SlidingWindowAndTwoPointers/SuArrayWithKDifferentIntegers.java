package SlidingWindowAndTwoPointers;

import java.util.HashMap;

public class SuArrayWithKDifferentIntegers {
    public static void main(String[] args) {
        int[]nums = {1,2,1,2,3};
        System.out.println(subarraysWithKDistinct(nums,2));
    }
    public static  int helper(int[]nums,int k){
        int i = 0 ;
        int j = 0 ;
        int count = 0;
        if(k<0) return 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        while(j<nums.length){
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            while(map.size()>k){
                map.put(nums[i],map.get(nums[i])-1);
                if(map.get(nums[i])==0){
                    map.remove(nums[i]);
                }
                i++;
            }
            count+=j-i+1;
            j++;
        }
        return count;
    }
    public static int subarraysWithKDistinct(int[] nums, int k) {
        return helper(nums,k)-helper(nums,k-1);
    }
}
