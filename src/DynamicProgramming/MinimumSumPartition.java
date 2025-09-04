package DynamicProgramming;

public class MinimumSumPartition {
    static int origSum = 0;
   static int min = Integer.MAX_VALUE;
    public static int helper(int[]arr , int sum , int n){
        if(n==0) return 0;
        if(sum<=0){
            int num = origSum-arr[n];
            return Math.min(min, arr[n]-num);
        }
        if(sum-arr[n]>=0){
            int take = helper(arr,sum-arr[n],n-1);
            int skip = helper(arr,sum,n-1);
            return Math.max(take,skip);
        }
        return helper(arr,sum,n-1);
    }
    public static int minDifference(int[] arr){
        int sum = 0;
        for(int it : arr){
            sum+=it;
        }
        origSum = sum;
        int n = arr.length;
        return helper(arr,sum,n);
    }
}
