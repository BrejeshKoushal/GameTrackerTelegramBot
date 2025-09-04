package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public void main(String[] args) {
//Input: num = [1,2,3]
//Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
        int[] nums = {1,2,3};
        System.out.println(subsets(nums));
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans  = new ArrayList<>();
        function(nums,0,ans,new ArrayList<>());
        return ans;
    }
    public void function(int[]arr,int pointer , List<List<Integer>> ans , List<Integer> list){
        if(pointer==arr.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        list.add(arr[pointer]);
        function(arr,pointer+1,ans,list);
        list.removeLast();
        function(arr,pointer+1,ans,list);
    }

}
