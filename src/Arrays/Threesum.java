package Arrays;

import java.util.*;
import java.util.stream.Collectors;

public class Threesum {
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(arr));
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        for(int i = 0 ; i<nums.length;i++){
            for(int j =i+1;j< nums.length;j++){
                for(int k = j+1;k< nums.length;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        set.add(Arrays.asList(nums[i],nums[j],nums[j]));
                    }
                }
            }
        }
        return set.stream().collect(Collectors.toList());
    }}
