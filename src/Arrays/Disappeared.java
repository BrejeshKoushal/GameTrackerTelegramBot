package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Disappeared {
    public static void main(String[] args) {
//                 0,1,2,3,4,5,6,7
        int[]arr ={4,3,2,7,8,2,3,1};
//
//
//
//
//

          System.out.println(findDisappearedNumbers(arr));
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int num:nums){
            int index = Math.abs(num);
            if(nums[index-1] > 0){
                nums[index-1]*=-1;
            }
        }
        for(int i = 0 ; i < nums.length;i++){
            if(nums[i] > 0){
                list.add(i+1);
            }
        }
        return list;
    }
    }

