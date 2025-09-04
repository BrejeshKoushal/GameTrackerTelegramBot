package assignments.firstjava.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RunningSumof1dArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        int[] ans = new int[size*2];
        for(int i = 0 ; i< size ;i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(runningSum(arr)));
    }

    static int[] runningSum(int[] nums) {


        int[] sum = new int[nums.length];
        sum[0]=nums[0];
        for(int i = 1 ; i<nums.length ; i++){
            sum[i] = sum[i-1]+nums[i];
        }
return sum;
    }
}
