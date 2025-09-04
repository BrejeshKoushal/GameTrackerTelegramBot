package StacksANDQueues.MonotonicProblems;

import java.util.ArrayList;

public class SumofSubarrayMinimums {
    public  void main(String[] args) {
        int[]arr = {3,1,2,4};
        System.out.println(sumSubarrayMins(arr));
    }
    int mod  = 1000000007;
    public int sumSubarrayMins(int[] arr) {
        int count=0;
        for(int i = 0 ; i < arr.length;i++){
            int min = Integer.MAX_VALUE%mod;
            for(int j = i ; j < arr.length;j++){
                min=Math.min(min,arr[j])%mod;
                count+=min%mod;
            }
        }
        return count;
    }
}
