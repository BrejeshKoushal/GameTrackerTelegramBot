package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {
    public void main(String[] args) {
        String st = "aab";
        System.out.println(partition(st));
    }
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        solver(s,ans,new ArrayList<>(),0);
        return ans;
    }
    public boolean IsPal(String s , int start , int end){
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public void solver(String s , List<List<String>> ans , List<String> list , int index){
        if(index==s.length()){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i = index;i<s.length();i++){
            if(IsPal(s,index,i)){
                list.add(s.substring(index,i+1));
                solver(s,ans,list,i+1);
                list.removeLast();
            }
        }

    }
}
