package DynamicProgramming;

public class FrogJump {
    static int ans = 0;
    public static int helper(int[]heights , int n){
        if(n == 0) return 0;
        int oneStep = helper(heights,n-1) + Math.abs(heights[n-1] - heights[n]) ;
        int twoStep = 0;
        if(n>1) twoStep = helper(heights,n-2) + Math.abs(heights[n-2] - heights[n])  ;
        return Math.min(oneStep,twoStep);
    }
    public static int frogJump(int[] heights) {
        int n = heights.length;
        return helper(heights,n-1);
    }
    public static void main(String[] args) {
        int[] heights = {2,1,3,5,4};
        System.out.println(frogJump(heights));
    }
}
































// int[] dp = new int[heights.length];
//        dp[0] = 0;
//        for (int i = 1; i < heights.length ;i++){
//            int fs = dp[i-1] + Math.abs(heights[i]-heights[i-1]);
//            int ss = Integer.MAX_VALUE;
//            if(i>1) {
//                 ss = dp[i-2] + Math.abs(heights[i]-heights[i-2]);
//            }
//            dp[i] = Math.min(fs,ss);
//        }
//        return dp[heights.length-1];