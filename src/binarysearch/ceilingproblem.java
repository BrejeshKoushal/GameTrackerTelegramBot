package binarysearch;

import java.util.Arrays;
import java.util.Scanner;

public class ceilingproblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements in ascending sorted order only : ");
        for(int i = 0 ; i < size ; i ++){
            arr[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.print("Enter the key whose ceiling value you want to find : ");
        int key = scanner.nextInt();
                int index = CeilingValue(arr , key);
        System.out.println(STR."The ceiling value of the \{key} is found at index \{index}");
    }
    static int CeilingValue(int[] arr , int key){

        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2 ;
            if(key == arr[mid]){
                return mid;
            }
            else if(key > arr[mid]){

                start = mid + 1;

            }
            else if(key < arr[mid])
            {
                end = mid -1;
            }

        }
        return start;

    }
}
