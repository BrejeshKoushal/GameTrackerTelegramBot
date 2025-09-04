package SlidingWindowAndTwoPointers;

public class BinarySubarrayWithSums {
    public static void main(String[] args) {
        int[]arr = {1,0,1,0,1};
        System.out.println(numSubarraysWithSum(arr,2));
    }
        public static int numSubarraysWithSum(int[] nums,int goal){
            return func(nums,goal)-func(nums,goal-1);
        }
        public static int func(int[] nums, int goal) {
            int i = 0,j=0,count=0,sum = 0;
            if(goal<0) return 0;
            while(j<nums.length ){
                sum+=nums[j];
                while(sum>goal){
                    sum-=nums[i];
                    i++;
                }
                count+=j-i+1;
                j++;
            }
            return count;
    }
}

