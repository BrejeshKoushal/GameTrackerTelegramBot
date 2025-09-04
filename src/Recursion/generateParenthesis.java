package Recursion;

import java.util.ArrayList;
import java.util.List;

public class generateParenthesis {
    public void main(String[] args) {
        System.out.println(generate(3));
    }
    public List<String> generate(int n) {
        List<String> list = new ArrayList<>();
        function(list, "",n,n);
        return list;
    }
    public void function(List<String> list ,String sb, int left , int right){
        if(left==0&&right==0){
            list.add(String.valueOf(sb));
        }
         if(left>0){
            function(list, STR."\{sb}(",left-1,right);
        }
         if(left<right)
            function(list, STR."\{sb})",left,right-1);
    }
}
