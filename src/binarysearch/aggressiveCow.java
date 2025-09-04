package binarysearch;

import java.util.Arrays;

public class aggressiveCow {
    public static void main(String[] args) {

    }
    public static boolean isPossible(int[] stalls,int cows,int distance){
        int count=1;
        int last=stalls[0];
        for(int i = 0 ;i<stalls.length;i++){
            if(stalls[i]-last>=distance){
                count++;
                last=stalls[i];
            }
        }
        return count >= cows;
    }
    public static int solve(int n, int k, int[] stalls){
        Arrays.sort(stalls);
        int start=1;
        int end = stalls[stalls.length-1]-stalls[0];
        while(start<=end){
            int mid = start+(end-start)/2;
            if(isPossible(stalls,k,mid)) start=mid+1;
            else end=mid-1;
        }
        return end;


    }
}
