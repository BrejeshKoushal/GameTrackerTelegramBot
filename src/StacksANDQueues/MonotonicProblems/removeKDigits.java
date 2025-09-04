package StacksANDQueues.MonotonicProblems;

import java.util.Stack;

public class removeKDigits {
    public static void main(String[] args) {
        System.out.println(removeKdigits("504116",3));
    }
    public static String removeKdigits(String num, int k) {
        if(k==0) return "0";
        Stack<Character> st = new Stack<>();
        for(int i = 0 ; i < num.length();i++){
            while(k>0&&!st.isEmpty()&&st.peek()>num.charAt(i)){
                st.pop();
                k--;
            }
            st.push(num.charAt(i));
        }
        while(k>0){
            st.pop();
            k--;
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        sb.reverse();
        while(sb.length()>1&&sb.charAt(0)=='0')
            sb.deleteCharAt(0);
        return sb.toString();
    }
}
