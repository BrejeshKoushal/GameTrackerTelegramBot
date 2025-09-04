package DynamicProgramming;

import java.util.Arrays;

public class BuySellWIthCooldown {
    int profit = 0;
    int[][]dp;
    public int helper(int[]prices , int i, int buy){
        if (i>=prices.length) return 0;
        if (dp[i][buy]!=-1) return dp[i][buy];
        if (buy == 1){
            int take = profit - prices[i] + helper(prices,i+1,0);
            int skip = helper(prices,i+1,1);
            return dp[i][buy] =  Math.max(take,skip);
        }
        else{
            int take =  profit + prices[i] +  helper(prices,i+2,1 );
            int skip = helper(prices,i+1,0);
            return dp[i][buy]= Math.max(take,skip);
        }
    }

    public int maxProfit(int[] prices) {
        dp = new int[prices.length+2][2];
        for (int i = prices.length-1 ; i >=0;i--){
            for (int j = 0 ; j <= 1 ;j++){
                if (j==1){
                    dp[i][j] = Math.max(-prices[i] + dp[i+1][0] , dp[i+1][1]);
                }
                else{
                    dp[i][j] = Math.max(prices[i] + dp[i+2][1] , dp[i+1][0]);
                }
            }
        }
        return dp[0][1];
    }
    public void main(String[] args) {
        int[] prices= {1,2,3,0,2};
        System.out.println(maxProfit(prices));
    }
}
