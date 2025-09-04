package Recursion;

public class TargetSum {
    public void main(String[] args) {
        int[]arr = {1,1,1,1,1};
        System.out.println(findTargetSumWays(arr,3));
    }
    public int findTargetSumWays(int[] nums, int target) {
        return recursion(nums,target,0,0);
    }
    public int recursion(int[]arr , int target , int sum , int index){
        if(index==arr.length){
            if(sum==target){
                return 1;
            }
            return 0;
        }
       int l = recursion(arr,target,sum+arr[index],index+1);
       int r = recursion(arr,target,sum-arr[index],index+1);
       return l+r;
    }
}
