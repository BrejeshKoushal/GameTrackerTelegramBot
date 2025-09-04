package StacksANDQueues.MonotonicProblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElement1 {
    public void main(String[] args) {
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        System.out.println(Arrays.toString(nextGreaterElement(nums1, nums2)));
    }
    public int[] nextGreaterElement(int[] nums1, int[] nums2){
        HashMap<Integer,Integer> map = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        for(int i = nums2.length-1;i>=0;i--){
            int currElement = nums2[i];
            while(!st.isEmpty() && currElement > st.peek()){
                st.pop();
            }
            if(st.isEmpty()){
                map.put(currElement,-1);
            }
            if(!st.isEmpty() && currElement<st.peek()){
                map.put(currElement,st.peek());
            }
            st.push(currElement);
        }
        int[]ans = new int[nums1.length];
        for(int i = 0 ; i < nums1.length;i++){
            ans[i] = map.get(nums1[i]);
        }
        return ans;
    }
}
