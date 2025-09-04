package Arrays;

import java.util.*;

public class FourSum {
    public static void main(String[] args) {
        int[] arr = {1000000000,1000000000,1000000000,1000000000};
        System.out.println(fourSum(arr,-294967296));
    }

    public static List<List<Integer>> fourSum(int[] nums, int target){

        List<List<Integer>> list = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();


        for(int i = 0 ;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                Set<Long> hashSet = new HashSet<>();
                for(int k = j+1;k<nums.length;k++){
                    long sum = nums[i]+nums[j];
                    sum+=nums[k];
                    long fourth = target-sum;
                    if(hashSet.contains(fourth)) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        temp.add((int) fourth);
                        Collections.sort(temp);
                        set.add(temp);
                    }
                    hashSet.add((long) nums[k]);

                }
            }
        }

        list.addAll(set);
        return list;

    }
}
