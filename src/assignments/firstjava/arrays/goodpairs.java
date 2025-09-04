package assignments.firstjava.arrays;

import java.util.Scanner;

public class goodpairs {

    //    Given an array of integers nums, return the number of good pairs.
//
//A pair (i, j) is called good if nums[i] == nums[j] and i < j.
//Example 1:
//
//Input: nums = [1,2,3,1,1,3]
//Output: 4
//Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1, 2, 3, 1, 1, 3};
        System.out.println(gp(arr));
    }

    static int gp(int[] arr){

        int count =0;
        for(int i = 0 ;i < arr.length ;i++){
            for(int j = 0; j<arr.length ;j++){
                if(arr[i]==arr[j]&&i<j){
                    count++;
                }
            }
        }
        return count;
    }

}
