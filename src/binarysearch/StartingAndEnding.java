package binarysearch;

import java.util.Arrays;

public class StartingAndEnding {
    public static void main(String[] args) {

        int[] arr = {1,3,4,5,6,6,6,6,6,7,8,9};
        System.out.println(Arrays.toString(searchRange(arr, 6)));
    }
    public static int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        int start = indexfinder(nums,true,target);
        int end = indexfinder(nums,false,target);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }

    public static int indexfinder(int[] arr , boolean findingStarting , int target){
        int start=0;
        int end = arr.length-1;
        int ans = -1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]<target ) start=mid+1;
            else if(arr[mid]>target) end=mid-1;
            else{
                ans=mid;
                if(findingStarting) end=mid-1;
                else start=mid+1;

            }
        }
return ans;
    }

}
