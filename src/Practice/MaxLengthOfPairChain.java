package Practice;

import java.util.Arrays;
import java.util.Comparator;


public class MaxLengthOfPairChain {
    int[][]dp;
    public int helper(int[][]pairs , int parent , int i){
        if (i==pairs.length) return 0;
        if (parent!=-1 && dp[i][parent]!=-1) return dp[i][parent];
        if (parent==-1 || pairs[i][0] > pairs[parent][1]){
            int a = Math.max(1 + helper(pairs,i,i+1), helper(pairs,parent,i+1));
            if (parent!=-1){
                dp[i][parent] = a;
            }
            return a;
        }
        return dp[i][parent] = helper(pairs,parent,i+1);
    }
    public int findLongestChain(int[][] pairs) {
        int n = pairs.length;
        dp = new int[n+1][n+1];
        for (int[]dip:dp) Arrays.fill(dip,-1);
        Arrays.sort(pairs,Comparator.comparingInt(a->a[0]));
        return helper(pairs,-1,0);
    }

    public void main(String[] args) {
        int[][] pairs ={{-10,-8},{8,9},{-5,0},{6,10},{-6,-4},{1,7},{9,10},{-4,7}};
        System.out.println(findLongestChain(pairs));
    }
}
