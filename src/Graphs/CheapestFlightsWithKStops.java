package Graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class CheapestFlightsWithKStops {
    static class Pair implements Comparable<Pair>{
        int node;
        int k;
        int cost;

        public Pair(int node, int k, int cost) {
            this.node = node;
            this.k = k;
            this.cost = cost;
        }

        @Override
        public int compareTo(Pair o) {
            return Integer.compare(this.cost,o.cost);
        }
    }
    public static int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        List<List<List<Integer>>> list = new ArrayList<>();
        for (int i = 0 ; i < n ; i++){
            list.add(new ArrayList<>());
        }
        for (int[] flight : flights) {
               int from = flight[0];
               int to = flight[1];
               int cost = flight[2];
               List<Integer> ins = new ArrayList<>();
               ins.add(to);
               ins.add(cost);
               list.get(from).add(ins);
            }
        int[] cost = new int[n];
        Arrays.fill(cost,Integer.MAX_VALUE);
        cost[src] = 0;

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(src,-1,0));
        while (!pq.isEmpty()){
            Pair pair = pq.remove();
            int node = pair.node;
            int kk = pair.k;
            int costs = pair.cost;
            for (List<Integer> l : list.get(node)) {
                int num = l.get(0);
                int dist = l.get(1);
                int sum = costs + dist;
                if (kk + 1 <= k) {
                    cost[num]=sum;
                    pq.add(new Pair(num, kk + 1, sum));
                }
            }
        }
        if(cost[dst]==Integer.MAX_VALUE){
            return -1;
        }
        return cost[dst];
    }
    public static void main(String[] args) {
        int n = 4,src = 0, dst = 3, k = 1;
        int[][] flights = {{0,1,100},{1,2,100},{2,0,100},{1,3,600},{2,3,200}};
        System.out.println(findCheapestPrice(n,flights,src,dst,k));
    }

}
