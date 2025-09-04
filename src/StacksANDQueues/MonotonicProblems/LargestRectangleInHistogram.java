package StacksANDQueues.MonotonicProblems;

public class LargestRectangleInHistogram {
    public static void main(String[] args) {
        int[]arr = {2,4};
        System.out.println(largestRectangleArea(arr));
    }
    public static int largestRectangleArea(int[] heights) {
        int largest_rectangle = 0;
        for(int i = 0 ; i < heights.length;i++){
            int min_element = heights[i];
            int current_largest = 0;
            int count = 0;
            for(int j = i ; j < heights.length;j++){
                min_element = Math.min(min_element,heights[j]);
                 current_largest = Math.max(min_element*(j-i+1),current_largest);
            }
            largest_rectangle = Math.max(largest_rectangle,current_largest);
        }
        return largest_rectangle;
    }

}
