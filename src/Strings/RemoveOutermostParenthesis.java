package Strings;

import java.util.Stack;

public class RemoveOutermostParenthesis {
    public static void main(String[] args) {
        String str = "(()())(())";
        System.out.println(removeOuterParentheses(str));
    }
    public static String removeOuterParentheses(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder ans = new StringBuilder();
        for(int i = 0 ; i < s.length();i++){
            if(s.charAt(i)=='(') {
                if (!st.isEmpty()) {
                    ans.append(s.charAt(i));
                }
                st.push(s.charAt(i));
            }
            else {
                if(st.size()>1){
                    ans.append(s.charAt(i));
                }
                st.pop();
            }

        }
        return ans.toString();
    }
}
