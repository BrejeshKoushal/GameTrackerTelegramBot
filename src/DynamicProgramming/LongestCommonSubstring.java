package DynamicProgramming;

public class LongestCommonSubstring {
    public static int longestSubstring(String x, String y){
        int m = x.length();
        int n = y.length();
        int[][] t = new int[m+1][n+1];
        for(int i = 0 ; i <=m ;i++){
            t[i][0]=0;
        }
        for(int j= 0 ; j<=n;j++){
            t[0][j]=0;
        }
        int max  = 0;
        for (int i = 1; i<=m ;i++){
            for(int j =1 ; j<=n;j++){
                if(x.charAt(i-1)==y.charAt(j-1)){
                    t[i][j] = 1 + t[i-1][j-1];
                    max = Math.max(max,t[i][j]);
                }
                else t[i][j]=0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        String x = "abbafffffffff";
        String y = "fffffffffabba";
        System.out.println(longestSubstring(x,y));
    }
}
