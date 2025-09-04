package Recursion;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void reverse(int[]arr){
        rev(arr,0,arr.length-1);

    }
    static void rev(int[]arr,int i ,int j){
        if(i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j] =temp;
        }
        else return;
        rev(arr,i+1,j-1);
    }
}
