package Recursion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak {
    public void main(String[] args) {
       String s = "catsanddog";
       List<String> list = new ArrayList<>();
       list.add("cats");
       list.add("dog");
       list.add("and");
        System.out.println(wordBreak(s,list));

    }
    public boolean wordBreak(String s, List<String> wordDict) {
        return solve(s,new HashSet<>(wordDict),0);
    }
    public boolean solve(String s, Set<String> dict , int index){
        if(index==s.length()){
            return true;
        }
        for(int i = index ; i < s.length();i++){
            if(dict.contains(s.substring(index,i+1))&&solve(s,dict,i+1)){

                return true;
            }
        }
        return false;
    }
}
