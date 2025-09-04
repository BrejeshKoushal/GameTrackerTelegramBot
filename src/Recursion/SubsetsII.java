package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsII {
    public void main(String[] args) {
        int[]arr = {1,2,2};
        System.out.println(subsetsWithDup(arr));
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        recursion(nums,0,ans,new ArrayList<>());
        return ans;
    }
    public void recursion(int[]arr,int index , List<List<Integer>> ans , List<Integer> list){
        if(index>=arr.length){
            ans.add(new ArrayList<>(list));
            return;
        }

        list.add(arr[index]);
        recursion(arr,index+1,ans,list);
        list.removeLast();
        while(index+1<arr.length && arr[index+1]==arr[index]) index+=1;
        recursion(arr,index+1,ans,list);
    }
}
