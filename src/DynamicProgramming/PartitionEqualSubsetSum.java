package DynamicProgramming;

public class PartitionEqualSubsetSum {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int it : nums){
            sum+=it;
        }
        int n = nums.length;
        boolean[][]dp =  new boolean[n+1][sum/2 + 1];
        if(sum%2==1) return false;
        for (int i = 0 ; i <= n; i++){
            dp[i][0] = true;
        }
        for (int i = 1 ; i <= n ; i++){
            for (int j = 1 ; j <dp[0].length ; j++){
                if (nums[i-1] <= j){
                    dp[i][j] = dp[i-1][j-nums[i-1]] || dp[i-1][j];
                }
                else dp[i][j] = dp[i-1][j];
            }
        }
        return dp[n][sum/2];
    }
    public void main(String[] args) {
        int[] nums = {1,5,11,5};
        System.out.println(canPartition(nums));
    }
}
