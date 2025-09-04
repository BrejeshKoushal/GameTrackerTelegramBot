package Recursion;

import java.util.Stack;

public class ReverseAStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        System.out.println(st);
        reverse(st);
        System.out.println(st);
//        [30]        []
//        [20]        []
//        [10]        []
//

    }
//    30->20->10
    static void reverse(Stack<Integer> s)
    {
        // add your code here
        if(s.isEmpty()){
            return;
        }
        int x = s.pop();
        reverse(s);
        function(s,x);

    }
    static void function(Stack<Integer> s , int x){
        if(s.isEmpty()){
            s.push(x);
            return;
        }
        int temp = s.pop();
        function(s,x);
        s.push(temp);
    }


}
