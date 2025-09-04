package Arrays;

import java.util.Arrays;

public class SemiOrderedPermutation {
    public static int semiOrderedPermutation(int[] nums) {
        int smallPos = -1;
        int min = Integer.MAX_VALUE;
        for (int i = 0 ; i < nums.length;i++){
            if (nums[i]<min){
                min = nums[i];
                smallPos = i;
            }
        }
        int count = 0;
        while (smallPos>0) {
            int temp = nums[smallPos];
            nums[smallPos] = nums[smallPos - 1];
            nums[smallPos - 1] = temp;
            smallPos--;
            count++;

        }
        int bigPos = -1;
        int max = Integer.MIN_VALUE;
        for (int i = 0 ; i<nums.length;i++){
            if (nums[i]>max){
                max=nums[i];
                bigPos=i;
            }
        }
        while (bigPos<nums.length-1){
            int temp = nums[bigPos];
            nums[bigPos] = nums[bigPos+1];
            nums[bigPos+1] = temp;
            bigPos++;
            count++;
        }

//        System.out.println(Arrays.toString(nums));
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(semiOrderedPermutation(arr));
    }
}
