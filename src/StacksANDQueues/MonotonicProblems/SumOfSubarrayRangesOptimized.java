package StacksANDQueues.MonotonicProblems;

import java.util.Arrays;
import java.util.Stack;

public class SumOfSubarrayRangesOptimized {
    public void main(String[] args) {
        int[] arr = {5,1,2,3};
        System.out.println(subArrayRanges(arr));
    }

    int mod = 1000000007;

    public long subArrayRanges(int[] nums) {
        return subArrayMax(nums)-subArrayMin(nums);
    }
    public long subArrayMax(int[]nums){
        Stack<Integer> st = new Stack<>();
        long[] nge = new long[nums.length];
        long[] pge = new long[nums.length];
        Arrays.fill(nge,nums.length);
        Arrays.fill(pge,-1);
        long sum = 0;
        for(int i = 0 ; i < nums.length;i++){
            while(!st.isEmpty()&&nums[st.peek()]<nums[i]){
                st.pop();
            }
            if(!st.isEmpty()){
                pge[i] = st.peek();
            }
            st.push(i);
        }
        st.clear();
        for(int i = nums.length-1 ; i>=0;i--){
            while(!st.isEmpty()&&nums[st.peek()]<nums[i]){
                st.pop();
            }
            if(!st.isEmpty()){
                nge[i] = st.peek();
            }
            st.push(i);
        }
        for(int i = 0;i<nums.length;i++){
            sum+=(i-pge[i])*(nge[i]-i)*nums[i];
        }
        return sum;
    }
    public long subArrayMin(int[]nums){
        Stack<Integer> st = new Stack<>();
        long[] nse = new long[nums.length];
        long[] pse = new long[nums.length];
        Arrays.fill(nse,nums.length);
        Arrays.fill(pse,-1);
        long sum = 0;
        for(int i = 0 ; i < nums.length;i++){
            while(!st.isEmpty()&&nums[st.peek()]>nums[i]){
                st.pop();
            }
                if(!st.isEmpty()){
                    pse[i] = st.peek();
                }
                st.push(i);
        }
        st.clear();
        for(int i = nums.length-1 ; i>=0;i--){
            while(!st.isEmpty()&&nums[st.peek()]>nums[i]){
                st.pop();
            }
            if(!st.isEmpty()){      
                nse[i] = st.peek();
            }
            st.push(i);
        }
        for(int i = 0;i<nums.length;i++){
            sum+=(i-pse[i])*(nse[i]-i)*nums[i];
        }
        return sum;
    }
}