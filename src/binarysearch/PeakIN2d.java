package binarysearch;

public class PeakIN2d {
    public static void main(String[] args) {

    }
    public int MaxIndexValue(int[][]arr,int n , int m , int col){
        int max = -1;
        int index = -1;
        for(int i = 0;i<n;i++){
            if(arr[i][col]>max){
                max=arr[i][col];
                index = i;
            }
        }
        return index;
    }


    public int[] findPeakGrid(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int start = 0;
        int end = m-1;
        while(start<=end){
            int mid =start+(end-start)/2;
            int mainRow = MaxIndexValue(mat,n,m,mid);
            int left = mid-1>0?mat[mainRow][mid-1]:-1;
            int right = mid+1>0?mat[mainRow][mid+1]:-1;
            if(mat[mainRow][mid]>left && mat[mainRow][mid]>right){
                return new int[]{mainRow, mid};
            }
            else if (mat[mainRow][mid]<left) end=mid-1;
            else start=mid+1;
        }
        return new int[]{-1, -1};
    }
}
