package SlidingWindowAndTwoPointers;

public class MaxConsecutiveOnes3 {
    public static void main(String[] args) {
        int[]arr = {0,0,1,1};
        System.out.println(longestOnes(arr,1));
    }
    public static int longestOnes(int[] nums, int k) {
        int i=0,j=0;
        int max = 0;
        int count = 0;
        while(j<nums.length){
            if(nums[j]==0){
                count++;
            }
            if(count>k){
                max=Math.max(max,j-i);
                if(nums[i]==0) count--;
                i++;
            }
            j++;
        }
        if(count<=k) {
            max = Math.max(max, j - i);
        }
        return max;
    }
}
