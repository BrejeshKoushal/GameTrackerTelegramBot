package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Comb3 {
    public void main(String[] args) {
        System.out.println(combinationSum3(3,7));
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        recurse(ans,new ArrayList<>(),k,n,1);
        return ans;
    }
    public void recurse(List<List<Integer>> ans , List<Integer> list , int k,int target,int index){
        if(list.size()==k&&target==0){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i = index ;i <=9 ;i++) {
            if (i <= target) {
                list.add(i);
                recurse(ans, list, k, target - i, i + 1);
                list.removeLast();
            }
        }

    }
}
