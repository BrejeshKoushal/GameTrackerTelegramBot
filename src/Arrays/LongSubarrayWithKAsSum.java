package Arrays;

public class LongSubarrayWithKAsSum {
    public int longestSubarray(int[] nums, int k) {
        int i = 0;
        int j = 0;
        int add = 0;
        int max = 0;
        while (j < nums.length) {
            add = add + nums[j];
            if (add > k) {
                add = add - nums[i];
                i++;
            } else if (add == k) {
                max = Math.max(max, j - 1 + 1);
                add = add - nums[i];
                i++;
            }
            System.out.println("add: " + add + " i:" + i + " j:" + j);

            j++;
        }
        return max;
    }

    public void main(String[] args) {
        int[]arr = {10,5,2,7,1,9};
        System.out.println(longestSubarray(arr,15));
    }
}