package binarysearch;

public class peakindexinmountaiin   {
    public static void main(String[] args) {


        int[] arr = {1, 3, 5, 6, 9, 12, 4, 2};
        int ans = mountain(arr);
        System.out.println(ans);
    }
static int mountain(int[]arr){
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            int mid = start + (end-start)/2;
            if(arr[mid] > arr[mid+1]){
//                you are in decreasing order
                end = mid;
            }
            else {
//                in ascending order
                start = mid+1;
            }
        }
        return start; //or end as both are same
}

}
