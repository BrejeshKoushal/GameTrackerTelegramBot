package DynamicProgramming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LongestIncreasingSubsequence {
    public static int lengthOfLIS(int[] nums) {
        int n = nums.length;
        List<Integer> sorted = new ArrayList<>();
        for (int num : nums) {
            int idx = Collections.binarySearch(sorted,num);
            if (idx < 0) idx = -(idx + 1);
            if (idx==sorted.size()) {
                sorted.add(num);
            }
            else sorted.set(idx,num);
        }
        return sorted.size();
    }
    public static void main(String[] args) {
        int[] arr = {10,9,2,5,3,7,101,18};
        System.out.println(lengthOfLIS(arr));
    }
}
