package DynamicProgramming;

public class MinNumberOfDeletionsToMakeStringPalindromic {
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
    public static int longest(String s){
        StringBuilder sb = new StringBuilder();
        sb.append(s).reverse();
        return longestSubsequenceLength(s,sb.toString());
    }
    public static int minDeletions(String s){
        int lps = longest(s);
        return s.length()-lps;
    }
    public static void main(String[] args) {
        String s = "agbcba";
        System.out.println(minDeletions(s));
    }
}
