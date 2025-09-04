package Arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LongestSuccessive {
    public static void main(String[] args) {

    }

    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n==0) return 0;
        int longest =1;
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        for(int it:set){
            if(!set.contains(it+1)){
                int cnt = 1;
                int x = it;
                while(set.contains(x+1)){
                    x=x+1;
                    cnt++;
                }
                longest=Math.max(longest,cnt);
            }
        }

return longest;
    }
}