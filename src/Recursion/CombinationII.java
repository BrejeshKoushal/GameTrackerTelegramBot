package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationII {
    public void main(String[] args) {
        int[] candidates = {10,1,2,7,6,1,5};
        int target = 8;
        System.out.println(combinationSum2(candidates, target));
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        recursion(candidates, target, ans, new ArrayList<>(), 0);
        return ans;
    }

    public void recursion(int[] arr, int target, List<List<Integer>> ans, List<Integer> list, int index) {
        if (target == 0) {
            ans.add(List.copyOf(list));
            return;
        }
        if (index == arr.length) return;


        list.add(arr[index]);
            recursion(arr, target - arr[index], ans, list, index + 1);
            list.removeLast();
//            while (index + 1 < arr.length && arr[index] == arr[index + 1]) index+=1;
            recursion(arr, target, ans, list, index + 1);
        }
}