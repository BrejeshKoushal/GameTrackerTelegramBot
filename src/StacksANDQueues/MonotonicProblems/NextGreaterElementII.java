package StacksANDQueues.MonotonicProblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElementII {
    public void main(String[] args) {
        int[] nums = {1,2,1};
        System.out.println(Arrays.toString(nextGreaterElements(nums)));
    }
    public int[] nextGreaterElements(int[] nums){
        Stack<Integer> st = new Stack<>();
        for(int i = nums.length-1; i>=0 ;i--){
            st.push(nums[i]);
        }
        for(int i = nums.length-1 ; i>=0;i--){
            int currElement = nums[i];
            while(!st.isEmpty() && currElement >= st.peek()){
                st.pop();
            }
            if(st.isEmpty()){
                nums[i] = -1;
            }
            else{
                nums[i] = st.peek();
            }
            st.push(currElement);
        }
        return nums;
    }
}
