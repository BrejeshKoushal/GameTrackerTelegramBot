package DynamicProgramming;

import java.util.Arrays;

public class MinNumberOfInsertionAndDeletion {
    public static int longestSubsequenceLength(String x , String y){
        int m = x.length();
        int n = y.length();
        int[][] t = new int[m+1][n+1];
        for(int i = 0 ; i <=m ;i++){
            t[i][0]=0;
        }
        for(int i = 0 ; i<=n;i++){
            t[0][i]=0;
        }
        for (int i = 1; i<=m ;i++){
            for(int j =1 ; j<=n;j++){
                if(x.charAt(i-1)==y.charAt(j-1)){
                    t[i][j] = 1 + t[i-1][j-1];
                }
                else t[i][j]=Math.max(t[i-1][j],t[i][j-1]);
            }
        }
        return t[m][n];
    }
    public static int[] insertDelete(String a , String b){
        int m = a.length();
        int n = b.length();
        int lcs = longestSubsequenceLength(a,b);
        return new int[]{n-lcs,m-lcs};
    }
    public static void main(String[] args) {
        String a = "heap";
        String b = "pea";
        System.out.println(Arrays.toString(insertDelete(a, b)));
    }
}
