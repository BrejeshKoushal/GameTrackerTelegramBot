package Strings;

import java.util.Stack;

public class ParenthesesRemoval {
    public void main(String[] args) {
        String s = "(()())(())";
        System.out.println(removeOuterParentheses(s));

    }

    public String removeOuterParentheses(String s) {
        StringBuilder build = new StringBuilder();
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='('){
                count++;
                if(count>1){
                    build.append('(');
                }
            }
            else{
                count--;
                if(count>0){
                build.append(')');
            }}
        }
            return build.toString();

    }
}
