package Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FractionalKnapsack {
    static class Pair implements Comparable<Pair>{
        int val;
        int weight;
        double ratio;

        public Pair(int val, int weight ,double ratio) {
            this.val = val;
            this.weight = weight;
            this.ratio=ratio;
        }

        @Override
        public int compareTo(Pair o) {
            return (int) (o.ratio - this.ratio);
        }
        @Override
        public String toString() {
            return STR."Pair{val=\{val}, weight=\{weight}, ratio=\{String.format("%.1f", ratio)}\{'}'}";
        }


    }
    public static double fractionalKnapsack(int[] val, int[] wt, long cap) {
        List<Pair> list = new ArrayList<>();
        for (int i = 0 ; i < wt.length;i++){
            int v = val[i];
            int w = wt[i];
            double r = (double) v /w;
            list.add(new Pair(v,w,r));
        }
        Collections.sort(list);
        System.out.println(list);
        int profit = 0;
        for (Pair pair : list){
            int v = pair.val;
            int w = pair.weight;
            if(w<=cap){
                profit+=v;
                cap-=w;
                System.out.println(cap);
            }
            else{
                    profit+= (int) ((v/w)*cap);
                    cap = 0;
            }
        }
        return profit;
    }
    public static void main(String[] args) {
       int[] val = {60,100,120}, wt = {10,20,30};
        int capacity = 50;
        System.out.println(fractionalKnapsack(val,wt,capacity));
    }
}
