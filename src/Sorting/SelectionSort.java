package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[]arr = {5,32,55,21,4,3,2,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[]arr){
        for(int i = 0;i<arr.length;i++){
            int min = min(arr,i,arr.length-1);
            swap(arr,min,i);
        }
    }
    static void swap(int[]arr,int i , int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static int min(int[]arr,int start,int end){
        int minimum = start;
        for(int i = start ; i<=end;i++ ){
            if(arr[i]<arr[minimum]){
                minimum=i;
            }

        }
        return minimum;
    }
}
