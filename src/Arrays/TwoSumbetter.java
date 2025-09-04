package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoSumbetter {
    public static void main(String[] args) {
        int[] arr = {2,6,5,8,11};
        System.out.println(Arrays.toString(twosum(arr, 14)));
    }
    public static int[] twosum(int[] nums , int target){
        int[] arr= new int[2];
        Arrays.sort(nums);
        int start = 0;
        int end = nums.length-1;
        while(start<end){
            if(nums[start]+nums[end]==target){
                arr[0]= start;
                arr[1] = end;
            }
            if(nums[start]+nums[end]>target){
                end--;
            }
            else start++;
        }

return arr;
    }
}
