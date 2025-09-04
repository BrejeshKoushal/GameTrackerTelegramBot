package DynamicProgramming;

import java.util.*;

public class WordBreak {
    static Set<String> set;
    static boolean[][] dp;

    public static boolean wordBreak(String s, List<String> wordDict) {
         set = new HashSet<>(wordDict);
         int n = s.length();
         dp = new boolean[n+1][n+1];
         for (int i = 0 ; i <= n ;i++){
             dp[0][i] = true;
             dp[i][0] = true;
         }
         for (int i  = 0 ; i < dp.length;i++){
             for (int j = n-1 ; j>=0 ; j--){
                 for (int k = i ; k<=j ; k++){
                     dp[i][j] = dp[i][j] ||  (dp[i][k] && dp[k][j]);
                 }
             }
         }
         return dp[n][0];
    }
    public static void main(String[] args) {
        String s = "aaaaaaa";
        List<String> wordDict = List.of("aaaa","aaa");
        System.out.println(wordBreak(s, wordDict));
    }
}
