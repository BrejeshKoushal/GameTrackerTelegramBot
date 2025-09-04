package Practice;

import java.util.HashMap;
import java.util.Map;

public class LC1493 {
    public int longestSubarray(int[] nums) {
        int k = 1;
        int i = 0;
        int j = 0;
        int n = nums.length;
        int max = -1;
        while(j<n){
            if (nums[j]==1){
                j++;
            }
            else {
                if (k>0){
                    k--;
                    j++;
                }
                else{
                    while(nums[i]!=0){
                        i++;
                    }
                    i++;
                    k=1;
                }
            }
            if(k>0) max = Math.max(j-i,max);
            else max = Math.max(j-i-1,max);
        }
        return max;
    }
    public void main(String[] args) {
        int[]arr = {1,1,1};
        Map<Integer,Integer> map = new HashMap<>();
        for (Map.Entry<Integer,Integer> mp : map.entrySet()){

        }
        System.out.println(longestSubarray(arr));
    }
}
