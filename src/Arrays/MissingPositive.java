package Arrays;

import java.util.Arrays;

public class MissingPositive {
    public  void main(String[] args) {
        int[]nums={1,4,3,-1};
        System.out.println(firstMissingPositive(nums));
    }
    public int firstMissingPositive(int[] nums){
        int i=0;
        while(i<nums.length){
            int correct = nums[i]-1;

            if(nums[i]>0 && nums[i] <=nums.length && nums[i] != nums[correct]){
                swap(nums, i, correct);
            }else{
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
        for(int j=0; j<nums.length; j++){
            if(nums[j] != j+1){
                return j+1;
            }
        }
        return nums.length + 1;

    }
    static void swap(int[] arr, int i, int i1) {
        int temp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = temp;
    }
}