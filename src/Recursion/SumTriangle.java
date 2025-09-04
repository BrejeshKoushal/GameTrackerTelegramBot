package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumTriangle {
    public static void main(String[] args) {
        int[]arr = {1, 2, 3, 4, 5};
        printTriangle(arr);
        System.out.println((Arrays.toString(arr)));
    }
    static void printTriangle(int[] x){
        int[]temp = new int[x.length-1];
        if(temp.length<1){
            return;
        }
        helper(x,temp,0);
        printTriangle(temp);
        System.out.println(Arrays.toString(temp));
    }
    static void helper(int[]arr ,int[]temp , int index){
        if(index==arr.length-1){
            return;
        }
        temp[index] = arr[index]+arr[index+1];
        helper(arr,temp,index+1);

    }


}
