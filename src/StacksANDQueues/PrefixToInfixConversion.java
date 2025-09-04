package StacksANDQueues;

import java.util.Stack;

public class PrefixToInfixConversion {
    public static void main(String[] args) {
        String st = "*-A/BC-/AKL";
        System.out.println(preToInfix(st));

    }
    public static String preToInfix(String pre_exp) {
        // code here
       Stack<String> st = new Stack<>();

       for(int i = pre_exp.length()-1;i>=0;i--){
           String ch = String.valueOf(pre_exp.charAt(i));
           if(ch.charAt(0)>='a'&&ch.charAt(0)<='z' || ch.charAt(0)>='A'&&ch.charAt(0)<='Z' || ch.charAt(0)>='0'&&ch.charAt(0)<='9') st.push(ch);
           else{
               String ans = "";
              String a = st.pop();
              String b = st.pop();
              ans = "(" + a + ch + b + ")";
           st.push(ans);
       }
       }
       return st.pop();
    }
}
