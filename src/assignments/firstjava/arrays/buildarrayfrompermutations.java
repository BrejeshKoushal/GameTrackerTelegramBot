package assignments.firstjava.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class buildarrayfrompermutations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] nums = new int[size];
        for(int i = 0 ; i< size ;i++){
            nums[i] = scanner.nextInt();
        }
        int[] ans = buildArray(nums);
        System.out.println(Arrays.toString(ans));

    }

    static int[] buildArray(int[] nums) {

        int[] ans = new int[nums.length];
        for(int i = 0 ; i<nums.length ; i++){
            ans[i] = nums[nums[i]];
        }

return ans;
    }

}


