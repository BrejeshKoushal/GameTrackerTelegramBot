package binarysearch;

import java.util.ArrayList;
public class Solu {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(12);
        arr.add(34);
        arr.add(67);
        arr.add(90);
        System.out.println(findPages(arr,4,2));
        System.out.println(func(arr,60));
    }
    public static int func(ArrayList<Integer>arr , int mid){
        int studentCount=1;
        long sum=0;
        for(int i = 0 ;i<arr.size();i++){
            if(sum+ arr.get(i) <=mid){
                sum+=arr.get(i);
            }
            else {
                studentCount+=1;
                sum=arr.get(i);
            }
        }
        return studentCount;
    }
    public static int findPages(ArrayList<Integer> arr, int n, int m) {
        // Write your code here
        int start = Integer.MAX_VALUE;
        int end = 0;
        for(int i = 0 ; i < n ;i++){
            start=Math.max(start, arr.get(i));
            end+= arr.get(i);
        }
        while(start<=end){
            int mid = start+(end-start)/2;
            if(func(arr,mid)>m) start=mid+1;
            else end=mid-1;
        }
        return start;

    }
}
