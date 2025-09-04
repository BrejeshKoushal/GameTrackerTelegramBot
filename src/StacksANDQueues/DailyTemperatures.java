package StacksANDQueues;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemperatures {
    class  Pair{
        int node;
        int val;

        public Pair(int node, int val) {
            this.node = node;
            this.val = val;
        }
    }
    public  int[] dailyTemperatures(int[] temperatures) {
        Stack<Pair> st = new Stack<>();
        int n = temperatures.length;
        int[]arr = new int[n];
        st.push(new Pair(temperatures[n-1],n-1));
        arr[n-1] = 0;
        for (int i = n-2 ;i >=0 ;i--) {
            while (!st.isEmpty() && temperatures[i] >= st.peek().node) {
                st.pop();
            }
            if (!st.isEmpty()) {
                arr[i] = st.peek().val - i;
            }
            st.push(new Pair(temperatures[i], i));
        }
        return arr;
    }
    public void main(String[] args) {
        int[] temperatures = {73,74,75,71,69,72,76,73};
        System.out.println(Arrays.toString(dailyTemperatures(temperatures)));
    }
}
