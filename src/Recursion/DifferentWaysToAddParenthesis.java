package Recursion;

import java.util.ArrayList;
import java.util.List;

public class DifferentWaysToAddParenthesis {
    public static void main(String[] args) {

    }
    public List<Integer> diffWaysToCompute(String expression) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i<expression.length();i++){
            char ch = expression.charAt(i);
            if(ch=='-'||ch=='+'||ch=='*'){
                List<Integer> left = diffWaysToCompute(expression.substring(0,i));
                List<Integer> right = diffWaysToCompute(expression.substring(i+1));
                for(int l : left){
                    for(int r : right){
                        if(ch=='+'){
                            list.add(l+r);
                        }
                       else if(ch=='-'){
                            list.add(l-r);
                        }
                       else list.add(l*r);
                    }
                }
            }
        }
        if(list.isEmpty())
            list.add(Integer.valueOf(expression));
        return list;

    }
}
