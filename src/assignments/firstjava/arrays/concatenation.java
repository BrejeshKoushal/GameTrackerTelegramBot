package assignments.firstjava.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class concatenation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        int[] ans = new int[size*2];
        for(int i = 0 ; i< size ;i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(getConcatenation(arr)));
    }
    static int[] getConcatenation(int[] nums) {

        int[] ans = new int[(nums.length)*2];
        for(int i = 0 ; i<nums.length ;i++){
            ans[i] = nums[i];
            ans[i+nums.length] = nums[i];
        }
return ans;
    }


}
