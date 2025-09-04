package Practice;

import java.util.Objects;
import java.util.Stack;

public class EvaluateReversePolishNotation {
    public static int calculate(int a , int b , String operand){
        if(Objects.equals(operand, "+")) return a+b;
        if(Objects.equals(operand, "-")) return a-b;
        if (Objects.equals(operand, "*")) return a*b;
        if (Objects.equals(operand, "/")) return a/b;
        StringBuilder sb = new StringBuilder();
        return -1;
    }
    public static int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        int n = tokens.length;
        for (int i =  0 ; i < n  ; i ++){
            if (Objects.equals(tokens[i], "+") || Objects.equals(tokens[i], "-") || Objects.equals(tokens[i], "*") || Objects.equals(tokens[i], "/")){
                int b = st.pop();
                int a = st.pop();
                st.push(calculate(a,b,tokens[i]));
            }
            else{
                st.push(Integer.parseInt(tokens[i]));
            }
        }
        return st.peek();
    }
    public static void main(String[] args) {
        String[]  tokens = {"2","1","+","3","*"};

        System.out.println(evalRPN(tokens));
    }
}
