package DynamicProgramming;

import java.util.Arrays;

public class TargetSum {
    int[][]dp;
    public int helper(int[]nums, int i , int sum){
        if (sum==0) return 1;
        if (i==nums.length) return 0;
        if (dp[i][sum]!=-1) return dp[i][sum];
        int count = 0;
        if (nums[i]<=sum){
            count+= helper(nums,i+1,sum-nums[i]) + helper(nums,i+1,sum);
        }
        else count+= dp[i][sum] = helper(nums,i+1,sum);
        return dp[i][sum] = count;
    }
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for (int it : nums){
            sum+=it;
        }
        if (target > sum) return 0;
        if ( (target+sum) % 2!=0) return 0;
        int s2  = (target+sum)/2;
        dp = new int[nums.length+1][s2+1];
        for (int[]pp:dp) Arrays.fill(pp,-1);
        return helper(nums,0,s2);
    }
    public void main(String[] args) {
        int[]nums = {1,1,1,1,1};
        int target = 3;
        System.out.println(findTargetSumWays(nums,target));
    }
}
