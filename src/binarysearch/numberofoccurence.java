package binarysearch;

public class numberofoccurence {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 2, 3};
        System.out.println(count(arr,7,2));
    }
   public static int count(int[] arr, int n, int x) {
        // code here
       int start = indexfinder(arr,true,x);
       int end = indexfinder(arr,false,x);
       if(start==-1||end==-1) return 0;
       else return end-start+1;
    }

    public static int indexfinder(int[  ] arr , boolean findingStarting , int target){
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
