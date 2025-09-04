package Recursion;

import java.util.Arrays;

public class rotateArray4{

    public void main(String[] args) {
int[]nums = {1,2,3,4,5,6,7};
     rotate(nums,3);
        System.out.println(Arrays.toString(nums));
    }

    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        rotation(nums,0,nums.length-1);
        rotation(nums,0,k-1);
        rotation(nums,k,nums.length-1);
    }
    public void rotation(int[]arr,int i ,int j){
       while(i<=j){
           int temp = arr[i];
           arr[i] = arr[j];
           arr[j] = temp;
           i++;
           j--;
       }
    }

}
