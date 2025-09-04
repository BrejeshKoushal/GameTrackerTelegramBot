package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class DiagonalTraverse {
    public  void main(String[] args) {
        int[][]arr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.toString(findDiagonalOrder(arr)));
    }
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[]arr = new int[m*n];
        int i = 0;
        int j = 0;
        int k = 0;
        boolean up = true;
        while(i<m && j<n){
            if(up){
                while(i>0 && j<n-1){
                    arr[k++] = mat[i][j];
                    i--;
                    j++;
                }
                arr[k++] = mat[i][j];
                if(j==n-1){
                    i++;
                }
                else{
                    j++;
                }
            }
            else{
                while(i<m-1 && j >0){
                    arr[k++] = mat[i][j];
                    i++;
                    j--;
                }
                arr[k++] = mat[i][j];
                if(i == m-1){
                    j++;
                }
                else{
                    i++;
                }
            }
            up = !up;
        }
        return arr;
                }
            }
