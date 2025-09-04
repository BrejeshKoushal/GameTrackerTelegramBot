package Arrays;

import java.util.ArrayList;
import java.util.List;

public class majority2_optimal {
    public static void main(String[] args) {
            int[] arr = {3,3,2};
        System.out.println(majorityElement(arr));
    }
    public static List<Integer> majorityElement(int[] nums){
        List<Integer> list = new ArrayList<>();
        int count1=0;
        int count2=0;
        int element1=Integer.MIN_VALUE;
        int element2=Integer.MIN_VALUE;
        for (int j : nums) {
            if (count1 == 0 && element2 != j) {
                count1 = 1;
                element1 = j;
            } else if (count2 == 0 && element1 != j) {
                count2 = 1;
                element2 = j;
            } else if (element1 == j) count1++;
            else if (j == element2) count2++;
            else {
                count2--;
                count1--;
            }
        }
        count1=0;
        count2=0;
        for (int num : nums) {
            if (element1 == num) count1++;
            if (element2 == num) count2++;
        }
        if(count1> nums.length/3) list.add(element1);
        if(count2> nums.length/3) list.add(element2);
        return list;
    }
}
