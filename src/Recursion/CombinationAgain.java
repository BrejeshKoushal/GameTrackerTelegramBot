package Recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationAgain {
    public void main(String[] args) {
        int[]arr = {2,3,5,6};
        System.out.println(combinationSum(arr,5));
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        recursive(candidates,target,list,new ArrayList<>(),0);
        return list;
    }
    public void recursive(int[]arr , int target , List<List<Integer>> ans , List<Integer> list,int index){
        if(index==arr.length){
            if(target==0){
                ans.add(new ArrayList<>(list));
            }
            return;
        }
        if(arr[index]<=target){
            list.add(arr[index]);
            recursive(arr,target-arr[index],ans,list,index);
            list.removeLast();
        }

        recursive(arr,target,ans,list,index+1);
    }
}
