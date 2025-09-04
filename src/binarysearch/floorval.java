package binarysearch;

public class floorval {
    public static void main(String[] args) {
        long[] arr = {1,2,3,5,7};
        System.out.println(findFloor(arr,5,4));
    }
    public static int findFloor(long[]arr, int n, long x)
    {
        if(x<arr[0]) return -1;
        int start=0;
        int end=n-1;
        while(start<=end){
            int mid= start+(end-start)/2;
            if(arr[mid]==x) return mid;
            else if(arr[mid]>x) end=mid-1;
            else if(arr[mid]<x) start=mid+1;

        }
        return end;
    }
}
