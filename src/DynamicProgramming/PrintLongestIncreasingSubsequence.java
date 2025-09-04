package DynamicProgramming;

import java.util.*;

public class PrintLongestIncreasingSubsequence {


    public static List<Integer> printLIS(int[]arr){
        int[] arr2 = new int[arr.length];
        TreeSet<Integer> set = new TreeSet<>();
        for (int j : arr) {
            set.add(j);
        }
        int k = 0;
        for (int it : set){
            arr2[k++] = it;
        }
        int m = arr.length;
        int n = arr2.length;
        int[][] t = new int[m+1][n+1];
        for(int i = 0 ; i <=m ;i++){
            t[i][0]=0;
        }
        for(int i = 0 ; i<=n;i++){
            t[0][i]=0;
        }
        for (int i = 1; i<=m;i++){
            for(int j =1 ; j<=n;j++){
                if(arr[i-1]==   arr2[j-1]){
                    t[i][j] = 1 + t[i-1][j-1];
                }
                else t[i][j]=Math.max(t[i-1][j],t[i][j-1]);
            }
        }

        int ind1 = m;
        int ind2 = n;
        ArrayList<Integer> ans = new ArrayList<Integer>();

        while(ind1>0 && ind2>0){
            if(arr[ind1-1]==arr2[ind2-1])
            {
                ans.add(arr[ind1-1]);
                ind1--;
                ind2--;
            }
            else{
                if(t[ind1][ind2-1]>t[ind1-1][ind2]){
                    ind2--;
                }else{
                    ind1--;
                }
            }
        }
        return ans.reversed();
    }
    public static void main(String[] args) {
        int[] arr = {5,4,11,1,16,8};
        System.out.println(printLIS(arr));
    }
}
