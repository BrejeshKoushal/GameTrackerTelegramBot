package Arrays;

public class contest {
    public static void main(String[] args) {
        int[]arr = {1,2,1,4,1};
        System.out.println(countSubarrays(arr));
    }
    public static int countSubarrays(int[] nums) {
            int count = 0;
            for(int i  = 0 ; i <= nums.length-3;i++){
                if((nums[i]+nums[i+2]) *2 == nums[i+1]) count++;
            }
            return count;
    }
}
