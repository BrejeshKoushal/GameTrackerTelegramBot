package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class RatInAMaze {
    public static void main(String[] args) {
        int[][] mat = {{1,0,0,0},{1,1,0,1},{1,1,0,0},{0,1,1,1}};
        System.out.println(findPath(mat,4));
    }
    public static ArrayList<String> findPath(int[][] m, int n) {
        ArrayList<String> ans = new ArrayList<>();
                if(m[0][0]==1){
                    helper(m,ans,"",0,0,n);
                }
                if(ans.isEmpty()) ans.add("-1");
        return ans;
    }
    public static void helper(int[][]m,ArrayList<String> ans , String list ,int row , int col,int n){
        if(row==n-1&&col==n-1) {
            ans.add(list);
            return;
        }
        m[row][col]=0;
        if(row+1<n&& (m[row+1][col]!=0)){

            helper(m,ans,list+"D",row+1,col,n);

        }

        if(row-1>=0&& (m[row-1][col]!=0)){

            helper(m,ans,list+"U",row-1,col,n);

        }
        if(col-1>=0&& (m[row][col-1]!=0)){

            helper(m,ans,list+"L",row,col-1,n);

        }
        if(col+1<n&& (m[row][col+1]!=0)){

            helper(m,ans,list+"R",row,col+1,n);

        }
        m[row][col]=1;

    }
}
