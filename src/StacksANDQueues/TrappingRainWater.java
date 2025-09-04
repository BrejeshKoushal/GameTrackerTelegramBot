package StacksANDQueues;

import java.util.Arrays;

public class TrappingRainWater {
    public void main(String[] args) {
    int[]arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(arr));
    }
        public int trap(int[] height) {
            int waterVolume = 0;
            for(int i = 0 ; i < height.length;i++){
                int lge = LGE(height,i);
                int rge = RGE(height,i);
                if(height[i]<lge&&height[i]<rge){
                    waterVolume+= Math.min(lge,rge)-height[i];
                }
            }
            return waterVolume;
        }
        public int LGE(int[]nums , int n){
            int[]arr =  new int[nums.length];
            int max = Integer.MIN_VALUE;
            for (int i = 0 ; i < nums.length;i++){
                max = Math.max(nums[i],max);
                arr[i] = max;
            }
            return arr[n];
        }
        public int RGE(int[]nums ,int n){
            int[] arr =  new int[nums.length];
            int max = Integer.MIN_VALUE;
            for(int i = nums.length-1;i>=0;i--){
                max = Math.max(nums[i],max);
                arr[i] = max;
            }
            return arr[n];
        }
}
