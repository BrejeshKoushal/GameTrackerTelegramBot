package StacksANDQueues.MonotonicProblems;

import java.util.ArrayList;
import java.util.Arrays;

public class HeightProblemSolution2 {
    public static void main(String[] args) {
        int[] heights = {12, 11, 12, 14, 13};
        System.out.println(Arrays.toString(nextGreaterHeights(heights)));
    }

    public static int[] nextGreaterHeights(int[] height) {
        int[] ans = new int[height.length];
        ArrayList<Integer> list = new ArrayList<>();
        ans[height.length - 1] = -1;
        list.add(height[height.length - 1]);

        for (int i = height.length - 2; i >= 0; i--) {
            int j = list.size() - 1;
            int currHeight = height[i];

            while (!list.isEmpty() && currHeight >= list.get(j)) {
                list.remove(j);
                j--;
            }

            if (list.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = list.get(j);
            }

            list.add(currHeight);
        }

        return ans;
    }
}
