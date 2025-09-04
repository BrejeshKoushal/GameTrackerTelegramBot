package StacksANDQueues.MonotonicProblems;

import java.util.Arrays;
import java.util.Stack;

public class SumOfSubarrayMinsOptimized {
    public void main(String[] args) {
        int[] arr = {3, 1, 2, 4};
        System.out.println(sumSubarrayMins(arr));
    }

    int mod = 1000000007;

    public int sumSubarrayMins(int[] arr) {
        int[] lse = new int[arr.length];
        int[] rse = new int[arr.length];
        Arrays.fill(lse,-1);
        Arrays.fill(rse,arr.length);
        Stack<Integer> st = new Stack<>();
        for(int i = 0 ; i < arr.length;i++){
            while(!st.isEmpty()&&arr[st.peek()]>arr[i]){
                st.pop();
            }
            if(!st.isEmpty()){
                lse[i] = st.peek();
            }
            st.push(i);
        }
        System.out.println(Arrays.toString(lse));
        st.clear();
        for(int i = arr.length-1 ; i >= 0;i--){
            while(!st.isEmpty()&&arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(!st.isEmpty()){
                rse[i] = st.peek();
            }
            st.push(i);
        }
        System.out.println(Arrays.toString(rse));
        long sum = 0;
        for(int i = 0 ; i < arr.length;i++){
            sum += (long) (i-lse[i])*(rse[i]-i)%mod*arr[i]%mod;
            sum%=mod;
        }
        return (int) sum;
    }
}

