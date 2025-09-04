package Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[]arr = {5,3,2,4,1};
        System.out.println(Arrays.toString(mergeSort(arr)));
    }
    public static int[] mergeSort(int[]arr){
        if(arr.length==1) return arr;
        int mid = arr.length/2;
        int[]left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[]right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }
    public static int[]merge(int[]first , int[]second){
        int i = 0 ;
        int j = 0;
        int k = 0 ;
        int[]arr = new int[first.length+second.length];
        while(i< first.length&&j< second.length){
            if(first[i]<second[j]){
                arr[k++]=first[i++];
            }
            else arr[k++]=second[j++];
        }
        while(i<first.length){
            arr[k++]=first[i++];
        }
        while(j<second.length){
            arr[k++]=second[j++];
        }
        return arr;
    }
}
