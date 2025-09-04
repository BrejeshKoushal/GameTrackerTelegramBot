package Graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class NumberOfWaysToArrive {
        static int mod = 1_000_000_007;

        static class Pair implements Comparable<Pair>{
            int node;
            int dist;

            public Pair(int node, int dist) {
                this.node = node;
                this.dist = dist;
            }


            @Override
            public int compareTo(Pair o) {
                return Integer.compare(this.dist,o.dist);
            }
        }
        public static int countPaths(int n, int[][] roads) {
            List<List<List<Integer>>>  list = new ArrayList<>();
            for (int i = 0 ; i < n; i++){
                list.add(new ArrayList<>());
            }
            for (int[] road : roads){
                int from = road[0];
                int to = road[1];
                int cost = road[2];

                list.get(from).add(Arrays.asList(to, cost));
                list.get(to).add(Arrays.asList(from, cost));
            }

            PriorityQueue<Pair> pq = new PriorityQueue<Pair>();
            int[] distance = new int[n];
            int[] paths = new int[n];
            Arrays.fill(distance,Integer.MAX_VALUE);
            Arrays.fill(paths,0);
            distance[0]=0;
            paths[0]=1;
            pq.add(new Pair(0,0));
            while(!pq.isEmpty()){
                Pair pair = pq.remove();
                int node = pair.node;
                int dist = pair.dist;
                for (List<Integer> list1 : list.get(node)){
                    int num = list1.getFirst();
                    int value = list1.get(1);
                    if (distance[num]==dist+value){
                        paths[num] =  ((paths[node]+paths[num])%mod);
                    }
                    else if(distance[num]>dist+value){
                        distance[num]=dist+value;
                        pq.add(new Pair(num,dist+value));
                        paths[num]=  (paths[node]%mod);
                    }
                }
            }
            return paths[n-1];
    }
    public static void main(String[] args) {
        int n = 7;
        int[][] roads = {{0,6,7},{0,1,2},{1,2,3},{1,3,3},{6,3,3},{3,5,1},{6,5,1},{2,5,1},{0,4,5},{4,6,2}};
        System.out.println(countPaths(n,roads));
    }

}
