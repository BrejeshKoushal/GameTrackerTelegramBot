package StacksANDQueues.MonotonicProblems;

public class TrappingWater {
    public static void main(String[] args){
        int[] arr = {4,2,0,3,2,5};
        System.out.println(trap(arr));
    }
    public static int trap(int[] height) {
        int lgw = 0;
        int rgw = 0;
        int i = 0;
        int j = height.length-1;
        int count = 0;
        while(i<j){
            if(height[i]<=height[j]){
                if(height[i]<=lgw){
                    count+= lgw-height[i];
                }
                lgw = Math.max(lgw,height[i]);
                i++;
            }
            else {
                if(height[j]<=rgw){
                    count+=rgw-height[j];
                }
                rgw = Math.max(rgw,height[j]);
                j--;
            }
        }
        return count;
    }
}
