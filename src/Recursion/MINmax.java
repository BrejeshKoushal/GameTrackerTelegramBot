package Recursion;

public class MINmax {
    public static void main(String[] args) {
        int[]arr = {1,-1,3,4,5};
        System.out.println(findMinRec(arr,0,Integer.MAX_VALUE));
        System.out.println(findMaxRec(arr,5));
    }
    public static int findMinRec(int[]arr, int index,int min){
        if(index==arr.length){
            return min;
        }
        if(arr[index]<min){
            min=arr[index];
        }
       return findMinRec(arr,index+1,min);
    }
    public static int findMaxRec(int[]arr,int n){
        if(n==1)return arr[0];
        return Math.max(arr[n-1],findMaxRec(arr,n-1));

    }
}
