package StacksANDQueues.MonotonicProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class AsteroidCollision {
    public void main(String[] args) {
        int[] asteroids = {5,10,-5};
        System.out.println(Arrays.toString(asteroidCollision(asteroids)));

    }
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for(int i = 0 ; i < asteroids.length;i++){
            boolean exploded = false;
            while(!st.isEmpty()&&st.peek()>=0&&asteroids[i]<0){
                if(Math.abs(asteroids[i])<st.peek()){
                    exploded=true;
                    break;
                }
                else if(Math.abs(asteroids[i])>st.peek()){
                    st.pop();
                }
                else{
                    exploded = true;
                    st.pop();
                    break;
                }
            }
           if(!exploded) st.push(asteroids[i]);
        }
        ArrayList<Integer> list = new ArrayList<>();
        while(!st.isEmpty()){
            list.add(st.pop());
        }
        int[] ans = new int[list.size()];
        for(int i = 0 ; i < ans.length;i++){
            ans[ans.length-i-1] = list.get(i);
        }
        return ans;
    }
}
