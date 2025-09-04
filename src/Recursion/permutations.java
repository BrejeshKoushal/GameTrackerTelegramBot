package Recursion;

import java.util.ArrayList;
import java.util.List;

public class permutations {
    public void main(String[] args) {
        int[]nums= {1,2,3};
        System.out.println(permute(nums));
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(nums,ans,new ArrayList<>());
        return ans;
    }
   public void solve(int[] nums,List<List<Integer>> ans , List<Integer> list ){
        if(list.size()==nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }
       for (int num : nums) {
           if(list.contains(num)) continue;
           list.add(num);
           solve(nums, ans, list);
           list.removeLast();
       }

   }
}
