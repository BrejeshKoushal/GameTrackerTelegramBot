package Sorting;

import java.util.Arrays;
import java.util.HashSet;

public class CountSort {
    public static void main(String[] args) {
        int[]arr = {3,4,1,3,2,5,2,8};
        countSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void countSort(int[]arr){
        int max = -1;
        for (int value : arr) {
            max = Math.max(max, value);
        }
        HashSet<Integer> set = new HashSet<>();
        int[] freq = new int[max+1];
        for (int k : arr) {
            freq[k]++;
        }
        int j = 0;
        for(int i = 0 ; i < freq.length;i++){
            while(freq[i]>0){
                arr[j++] = i;
                freq[i]--;
            }
        }
    }
}
