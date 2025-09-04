package StacksANDQueues.MonotonicProblems;

import java.util.Stack;

public class largestRectangleInHistogramOptimized2 {
    public  void main(String[] args) {
        int[]arr = {2,1,5,6,2,3};
        System.out.println(largestRectangleArea(arr));
    }
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int max = 0;
        for (int i = 0; i < heights.length; i++) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                int height = heights[st.peek()];
                st.pop();
                int width;
                if (st.isEmpty()) {
                    width = i;
                } else {
                    width = i - st.peek() - 1;
                }
                max = Math.max(max, height * width);
            }
            st.push(i);
        }
        return max;
    }
    }
