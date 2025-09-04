package Sorting;

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
//                  0 1 2 3 4
        int[] arr = {3,4,-1,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

        static void sort ( int[] nums){
            int i = 0;
            while (i < nums.length) {
                if (nums[i] <= 0 || nums[i] > nums.length) {
                    i++;
                    continue;
                }
                int correct = nums[i] - 1;
                if (nums[i] != nums[correct]) {
                    int temp = nums[i];
                    nums[i] = nums[correct];
                    nums[correct] = temp;
                } else {
                    i++;
                }
        }
    }
}
