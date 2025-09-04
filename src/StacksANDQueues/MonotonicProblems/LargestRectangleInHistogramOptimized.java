package StacksANDQueues.MonotonicProblems;

import java.util.Arrays;
import java.util.Stack;

public class LargestRectangleInHistogramOptimized {
    public static void main(String[] args) {
        int[] arr = {2,1,5,6,2,3};
        System.out.println(largestRectangleArea(arr));
    }
    public static int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int[] lse = new int[heights.length];
        int[] rse = new int[heights.length];
        Arrays.fill(lse,-1);
        Arrays.fill(rse,heights.length);
        for(int i = 0 ; i < heights.length;i++){
            while(!st.isEmpty()&&heights[st.peek()]>heights[i]){
                st.pop();
            }
            if(!st.isEmpty()){
                lse[i] = st.peek();
            }
            st.push(i);
        }
        st.clear();
        for(int i = heights.length-1 ; i >=0;i--){
            while(!st.isEmpty()&&heights[st.peek()]>heights[i]){
                st.pop();
            }
            if(!st.isEmpty()){
                rse[i] = st.peek();
            }
            st.push(i);
        }
        int maxArea = 0;
        for(int i = 0 ; i < heights.length;i++){
            maxArea = Math.max(maxArea,((rse[i]-lse[i])-1)*heights[i]);
        }
        return maxArea;
    }
}
