package StacksANDQueues.MonotonicProblems;

import java.util.ArrayList;

public class SumofSubarrayRanges {
    public  void main(String[] args) {
        int[] arr = {4,-2,-3,4,1};
        System.out.println(subArrayRanges(arr));
    }
    public long subArrayRanges(int[] nums) {
        long count = 0;
        for(int i = 0 ; i < nums.length;i++){
            int max = nums[i];
            int min = nums[i];
            for(int j = i ; j < nums.length;j++){
                max = Math.max(max,nums[j]);
                min = Math.min(min,nums[j]);
                count +=  (max - min);
            }
        }
        return count;
    }
}
