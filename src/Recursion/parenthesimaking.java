package Recursion;

import java.util.ArrayList;
import java.util.List;

public class parenthesimaking {
    public void main(String[] args) {
        int n = 3;
        System.out.println(generateParenthesis(n));
    }

    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        function(ans, "",n,0,0);
        return ans;
    }
    public void function(List<String> list,String sb,int n , int left, int right){
        if(left==n&&right==n){
            list.add(String.valueOf(sb));
            return;
        }
        if(left<n){
            function(list,STR."\{sb}(",n,left+1,right);
        }
        if(left>right){
            function(list,STR."\{sb})",n,left,right+1);
        }
    }
}
