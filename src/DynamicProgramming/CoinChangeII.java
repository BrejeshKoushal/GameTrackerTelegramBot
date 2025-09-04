package DynamicProgramming;

import java.util.Arrays;

public class CoinChangeII {
    int[][]dp;
    public int helper(int[] coins , int i , int amount){
        if (amount==0) return 1;
        if (i==coins.length) return 0;
        int take = 0;
        if (dp[i][amount]!=-1) return dp[i][amount];
        if (coins[i]<=amount){
             take = helper(coins,i,amount-coins[i]);
        }
        int skip = helper(coins,i+1,amount);
        return dp[i][amount] = take + skip;
    }
    public int change(int amount, int[] coins) {
        dp = new int[coins.length+1][amount+1];
        for (int i = 0 ; i <= coins.length;i++){
            dp[i][0] = 1;
        }

        for (int i = 1; i<=coins.length;i++ ) {
            for (int j = 0; j <= amount; j++) {
                int take = 0;
                if (coins[i - 1] <= j) {
                   take=dp[i][j - coins[i - 1]];
                }
                 int skip = dp[i-1][j];
                dp[i][j] = take+skip;
             }
        }
        return dp[coins.length][amount];
    }
    public  void main(String[] args) {
        int[]  coins = {1,2,5};
        int amount = 5;
        System.out.println(change(amount,coins));
    }
}
