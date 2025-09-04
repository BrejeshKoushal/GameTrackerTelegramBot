package StacksANDQueues;

import java.util.*;

public class CarFleet {
    class Pair{
        int pos;
        int speed;

        public Pair(int pos, int speed) {
            this.pos = pos;
            this.speed = speed;
        }
        @Override
        public String toString() {
            return "(" + pos + ", " + speed + ")";
        }

    }
    public int carFleet(int target, int[] position, int[] speed) {
        List<Pair> list = new ArrayList<>();
        int n = position.length;
        for (int i = 0 ; i < n ; i++){
            list.add(new Pair(position[i] , speed[i]));
        }
        list.sort((a,b)->b.pos-a.pos);
        System.out.println(list);
        Stack<Double> st = new Stack<>();
        for (int i = 0 ; i < list.size();i++){
            double tt = (double) ((target - list.get(i).pos)/list.get(i).speed);
            if (st.isEmpty() || tt > st.peek()){
                st.push(tt);
            }
        }
        return st.size();
    }
    public void main(String[] args) {
       int target = 12;
       int [] position = {10,8,0,5,3};
       int [] speed = {2,4,1,1,3};
        System.out.println(carFleet(target,position,speed));
    }
}
