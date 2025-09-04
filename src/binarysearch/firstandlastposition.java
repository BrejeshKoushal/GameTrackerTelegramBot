package binarysearch;

import java.util.Arrays;
import java.util.Scanner;

public class firstandlastposition {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements in ascending sorted order only (You can repeat numbers) : ");
        for(int i = 0 ; i < size ; i ++){
            arr[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.print("Enter the key whose start and end value you want to value you want to find : ");
        int key = scanner.nextInt();
        System.out.println(Arrays.toString(searchrange(arr, key)));

    }

    static int[] searchrange(int[] arr , int key ){
        int[] ans = {-1 , -1};
        int start = numstarget(arr , key , true);
        int end = numstarget(arr , key , false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }
    static int numstarget(int[] arr , int key , boolean findingStartIndex){
        int start = 0 ;
         int end = arr.length-1;
         int ans = -1;
         while(start <= end){
             int mid = start+(end-start)/2;
               if(key<arr[mid]){
                   end = mid-1;
               }
               else if(key>arr[mid]){
                   start = mid + 1;
               }
               else{
                   ans = mid;
                   if(findingStartIndex){
                       end = mid-1;
                   }
                   else{
                       start = mid + 1;
                   }
               }


         }
         return ans;
    }














}