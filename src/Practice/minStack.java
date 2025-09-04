package Practice;

import java.util.Stack;

public class minStack {
    class Pair{
        int node;
        int min;

        public Pair(int node, int min) {
            this.node = node;
            this.min = min;
        }
    }
    Stack<Pair> st;
    public minStack() {
        st = new Stack<>();
    }

    public void push(int val) {
        if(!st.isEmpty()) st.push(new Pair(val , Math.min(val , st.peek().min)));
        else{
            st.push(new Pair(val , val));
        }
    }

    public void pop() {
        st.pop();
    }

    public int top() {
        return st.peek().node;
    }

    public int getMin() {
        return st.peek().min;
    }
}
