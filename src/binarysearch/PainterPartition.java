package binarysearch;

import java.util.ArrayList;

public class PainterPartition {
    public static void main(String[] args) {

    }
    public static int func(ArrayList<Integer> arr, int mid){
        int k = 1;
        long sum =0;
        for(int i = 0 ; i<arr.size();i++){
            if(arr.get(i) +sum <= mid){
                sum+= arr.get(i);
            }
            else {
                sum = arr.get(i);
                k++;
            }
        }
        return k;
    }
    public static int findLargestMinDistance(ArrayList<Integer> boards, int k)
    {
        //    Write your code here.
        int start=Integer.MIN_VALUE;
        int end = 0;
        for(int i = 0 ; i < boards.size();i++){
            start = Math.max(start, boards.get(i));
            end+= boards.get(i);
        }
        System.out.println(start+"start value");
        System.out.println(end + "end value");
        while(start<=end){
            int mid = start+(end-start)/2;
            if(func(boards,mid)<=k) end = mid-1;
            else start = mid+1;
        }
        return start;
    }
}
