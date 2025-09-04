package DynamicProgramming;


public class PrintShortestCommonSubsequence {
    public static String printPath(String x, String y){
        StringBuilder st = new StringBuilder();
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
        int i = m;
        int j = n;
        while(i>0 && j>0){
            if(x.charAt(i-1)==y.charAt(j-1)){
                st.append(x.charAt(i-1));
                i--;
                j--;
            }
            else if(t[i-1][j]>=t[i][j-1]){
                st.append(x.charAt(i-1));
                i--;
            }
            else if(t[i][j-1]>=t[i-1][j]){
                st.append(y.charAt(j-1));
                j--;
            }
        }
        while (j>0){
            st.append(y.charAt(j-1));
            j--;
        }
        while (i>0){
            st.append(x.charAt(i-1));
            i--;
        }
        return st.reverse().toString();
    }
    public static void main(String[] args) {
        String a = "hello";
        String b = "geek";
        System.out.println(printPath(a,b));
    }
}
