package binarysearch;

class Solution {
    public static void main(String[] args) {
        int[]arr = {1,2,5,9};
        System.out.println(aftersum(arr,5));
    }
    public static long aftersum(int[]arr,int mid){
        long sum=0;
        for(int i =0;i<arr.length;i++){
            long rem=  Math.ceilDiv(arr[i],mid);
            sum+=  rem;
        }
        return sum;
    }

    public static int smallestDivisor(int[] nums, int threshold) {
        long sum=0;
        int min = 1;
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<nums.length;i++){
            max = Math.max(max,nums[i]);
            sum+=nums[i];
        }
        if(sum<threshold) return 1;
        int start = min;
        int end = max;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(aftersum (nums,mid)<=threshold) end = mid-1;
            else start=mid+1;
        }
        return start;
    }

}
