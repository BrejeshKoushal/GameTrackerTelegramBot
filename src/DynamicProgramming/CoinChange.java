package DynamicProgramming;

import java.util.Arrays;

public class CoinChange {
    int[][]dp;
    public int helper(int[] coins , int amount , int m){
        if (amount==0) return 0;
        if(m>=coins.length) return Integer.MAX_VALUE-1;
        if (dp[m][amount]!=-1) return dp[m][amount];
        if(coins[m] <= amount){
            return dp[m][amount] = Math.min(1 + helper(coins, amount - coins[m] , m) , helper(coins,amount,m+1));
        }
        else return dp[m][amount] = helper(coins,amount,m+1);
    }
    public int coinChange(int[] coins, int amount) {
        dp = new int[coins.length+1][amount+1];
        for (int [] dip : dp) Arrays.fill(dip,-1);
        int ans = helper(coins,amount,0);
        return ans ==Integer.MAX_VALUE-1 ? -1 : ans ;
    }
    public void main(String[] args) {
        int[] coins = {1,2,5};
        int amount = 11;
        System.out.println( coinChange(coins,amount));
    }
}
