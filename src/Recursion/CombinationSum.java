package Recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public void main(String[] args) {
        int[] arr = {2, 3, 6, 7};
        System.out.println(combinationSum(arr, 7));
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        recursion(ans,candidates,0,target,new ArrayList<>());
        return ans;

    }

    public void recursion(List<List<Integer>> ans, int[] arr, int index, int target, List<Integer> list) {
        if(index==arr.length){
            if(target==0){
                ans.add(new ArrayList<>(list));
            }
            return;
    }
        if(arr[index]<=target){
            list.add(arr[index]);
            recursion(ans,arr,index,target-arr[index],list);
            list.removeLast();
        }
        recursion(ans,arr,index+1,target,list);
}}
