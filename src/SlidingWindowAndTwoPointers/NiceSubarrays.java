package SlidingWindowAndTwoPointers;

public class NiceSubarrays {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 5, 7};
        System.out.println(numberOfSubarrays(arr, 2));
    }

    public static int helper(int[]nums,int k){
        int i=0,j=0;
        if(k<0) return 0;
        int sum = 0;
        int count =0;
        while(j<nums.length){
            if((nums[j]&1)==1) sum+=1;
            while(sum>k){
                if((nums[i]&1)==1) sum-=1;
                i++;
            }
                count += (j - i + 1);
                j++;
        }
        return count;
    }
    public static int numberOfSubarrays(int[] nums, int k) {
        return helper(nums,k)-helper(nums,k-1);
    }
}
