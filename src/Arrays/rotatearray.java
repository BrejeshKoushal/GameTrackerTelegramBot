package Arrays;

import java.util.Arrays;

public class rotatearray {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7};
        rotate(arr,3);

    }
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int[] temp = new int[k];

        // Store the elements that will be shifted
        for (int i = 0; i < k; i++) {
            temp[i] = nums[n - k + i];
        }

        // Shift the elements to the right by k places
        for (int i = n - 1; i >= k; i--) {
            nums[i] = nums[i - k];
        }

        // Copy the elements from the temporary array back into the original array
        for (int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }
    }



}
