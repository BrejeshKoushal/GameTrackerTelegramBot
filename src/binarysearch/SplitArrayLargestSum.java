package binarysearch;

public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int[]arr = {10,20,30,40};
        System.out.println(splitArray(arr,2));
    }
    public static int func(int[]arr,int mid){
        int k = 1;
        long sum =0;
        for(int i = 0 ; i<arr.length;i++){
            if(arr[i]+sum <= mid){
                sum+=arr[i];
            }
            else {
                sum = arr[i];
                k++;
            }
        }
        return k;
    }
    public static int splitArray(int[] nums, int k){
            int start=Integer.MIN_VALUE;
            int end = 0;
            for(int i = 0 ; i < nums.length;i++){
                start = Math.max(start,nums[i]);
                end+=nums[i];
            }
            System.out.println(start+"start value");
            System.out.println(end + "end value");
            while(start<=end){
                int mid = start+(end-start)/2;
                if(func(nums,mid)<=k) end = mid-1;
                else start = mid+1;
            }
            return start;
    }
    }
