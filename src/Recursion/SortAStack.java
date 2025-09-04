package Recursion;

import java.util.Stack;

public class SortAStack {
    public void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(5);
        st.push(4);
        st.push(3);
//        30,20,10,5,4,1;
        System.out.println(sort(st));
    }
    public Stack<Integer> sort(Stack<Integer> s) {
        // add code here.
        function(s);
        return s;
    }
    public static void function(Stack<Integer> s) {
        if(!s.isEmpty()){
            int x =  s.pop();
            function(s);
            insert(s,x);
        }
    }
    public static void insert(Stack<Integer> s,int x){
        if(s.isEmpty()||s.peek()<x){
            s.push(x);
            return;
        }
        int temp = s.pop();
        insert(s,x);
        s.push(temp);
    }
    }
