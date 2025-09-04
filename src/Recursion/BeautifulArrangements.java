package Recursion;

import java.util.ArrayList;
import java.util.List;

public class BeautifulArrangements {
    public void main(String[] args) {
        System.out.println(countArrangement(3));
    }
    int count=0;
    public  List<List<Integer>>  countArrangement(int n) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] used = new boolean[n+1];
        helper(n,ans,used,new ArrayList<>(),1);
        System.out.println(count);
        return ans;
    }

    public void helper(int n, List<List<Integer>> ans ,boolean[] used,List<Integer> list,int index){

        if(index>n){
            count+=1;
            ans.add(new ArrayList<>(list));
            return;
        }

        for(int i =1;i<=n;i++){
            if(!used[i]&&((i%index==0)||(index%i==0))){
                used[i] = true;
                list.add(i);
                helper(n,ans,used,list,index+1);
                used[i] =false;
                list.removeLast();
            }
        }

    }
}