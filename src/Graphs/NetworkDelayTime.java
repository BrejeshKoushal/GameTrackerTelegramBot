package Graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class NetworkDelayTime {
        static class Pair implements Comparable<Pair> {
            int node;
            int time;

            Pair(int node, int time) {
                this.node = node;
                this.time = time;
            }

            @Override
            public int compareTo(Pair other) {
                return other.time - this.time; // reverse to make it max-heap
            }
        }

        public static int networkDelayTime(int[][] times, int n, int k) {
            List<List<List<Integer>>> list = new ArrayList<>();
            for (int i = 1; i <= n; i++) {
                list.add(new ArrayList<>());
            }
            for (int[] flight : times) {
                int from = flight[0];
                int to = flight[1];
                int cost = flight[2];
                List<Integer> ins = new ArrayList<>();
                ins.add(to);
                ins.add(cost);
                list.get(from - 1).add(ins);
            }
            System.out.println(list);
            PriorityQueue<Pair> pq = new PriorityQueue<>();
            pq.add(new Pair(k, 0));
            int[] dist = new int[n];
            Arrays.fill(dist, Integer.MIN_VALUE);
            dist[k - 1] = 0;
            while (!pq.isEmpty()) {
                Pair pair = pq.remove();
                int node = pair.node;
                int time = pair.time;
                for (List<Integer> l : list.get(node - 1)) {
                    int num = l.getFirst();
                    int timer = l.get(1);
                    if (dist[num - 1] < timer + time) {
                        dist[num - 1] = timer + time;
                        pq.add(new Pair(num, timer + time));
                    }
                }
            }
            int maxTime = Integer.MIN_VALUE;
            for (int d : dist) {
                if (d == Integer.MIN_VALUE) return -1;
                maxTime = Math.max(maxTime, d);
            }

            return maxTime;
        }
    public static void main(String[] args) {
        int[][]times = {{2,1,1},{2,3,1},{3,4,1}};
        int n = 4, k = 2;
        System.out.println(networkDelayTime(times,n,k));
    }
}
