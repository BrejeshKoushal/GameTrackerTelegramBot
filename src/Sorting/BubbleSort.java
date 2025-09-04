package Sorting;

import java.util.Arrays;
import java.util.Collections;

public class BubbleSort {
    public static void main(String[] args) {
        int[]arr = {5,4,3,2,1};
        sort(arr);
        System.out.println(Arrays.toString((arr)));
    }
    static void sort(int[]arr){
        boolean swapped;
        for(int i = 0 ;i<arr.length;i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
                swapped = true;
            }
            if(!swapped){
                break;
        }

        }

    }
    static void swap(int[]arr,int i ,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
