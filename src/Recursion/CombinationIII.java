package Recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationIII {
    public void main(String[] args) {
        System.out.println(combinationSum3(3,7));
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        recursion(ans,new ArrayList<>(),k,n,1,0);
        return ans;
    }
    public void recursion(List<List<Integer>>ans , List<Integer> list , int k ,int n ,int index,int sum){
        if(n==0&&k==0){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i = index ; i <=9 ;i++){
            sum+=i;
            list.add(i);
            recursion(ans,list,k-1,n-i,i+1,sum);
            list.removeLast();
        }


    }
}
