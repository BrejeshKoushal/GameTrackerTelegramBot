package DynamicProgramming;

public class FrogJumpII {
    public static int frogJump(int[] heights, int k) {
        int n = heights.length;
        int[] dp = new int[n+1];
        dp[0] = 0;
        for (int i = 1 ; i<n ; i++){
            int min = Integer.MAX_VALUE;
            for (int j = 1 ; j <=k;j++){
               if(i-j >=0) {
                   min = Math.min(min, Math.abs(heights[i] - heights[i - j]) + dp[i - j]);
               }
            }
            dp[i] = min;
        }
        return dp[n-1];
    }
    public static void main(String[] args) {
        int[] heights = {10, 5, 20, 0, 15};
        int k = 2;
        System.out.println(frogJump(heights,k));
    }
}
