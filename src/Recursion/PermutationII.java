package Recursion;

import java.util.*;

public class PermutationII {
    public void main(String[] args) {
        int[] arr = {1, 2, 1};
        System.out.println(permuteUnique(arr));
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(ans, nums, 0);
        return ans;
    }

    public void solve(List<List<Integer>> ans, int[] nums, int index) {
        if (index == nums.length) {
            List<Integer> list = new ArrayList<>();
            for(int num:nums){
                list.add(num);
            }
            ans.add(list);
            return;
        }
        Set<Integer> set = new HashSet<>();
        for(int i = index ; i < nums.length;i++){
            if(set.contains(nums[i])) continue;
            set.add(nums[i]);
            swap(nums,index,i);
            solve(ans,nums,index+1);
            swap(nums,index,i);
        }

    }
    public void swap(int[]nums , int a , int b){
        int temo = nums[a];
        nums[a] = nums[b];
        nums[b]= temo;
    }
}
