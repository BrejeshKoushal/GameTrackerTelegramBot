package DynamicProgramming;

import java.util.Arrays;

public class LIS {
    int[]dp;
    public int lengthOfLIS(int[] nums) {
        dp = new int[nums.length+1];
        int n = nums.length;
        int max = 1;
        Arrays.fill(dp,1);
       for (int i = 0 ; i < n ; i++){
           for (int j = 0 ; j < i ;j++){
               if (nums[i] > nums[j]){
                   dp[i] = Math.max(dp[i] , dp[j]+1);
                   max = Math.max(max,dp[i]);
               }
           }
       }
        return max;
    }
    public void main(String[] args){
        int[] arr = {10,9,2,5,3,7,101,18};
        System.out.println(lengthOfLIS(arr));
    }
}
