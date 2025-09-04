package Graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class PrimsAlgorithm {

    static class Pair implements Comparable<Pair> {
        int node;
        int weight;

        public Pair(int node, int weight) {
            this.node = node;
            this.weight = weight;
        }

        @Override
        public int compareTo(Pair o) {
            return Integer.compare(this.weight,o.weight);
        }
    }
    public static int spanningTree(int V, List<List<Integer>> adj) {
        List<List<List<Integer>>> list = new ArrayList<>();
        for (int i = 0 ; i < V ;i++){
            list.add(new ArrayList<>());
        }
        for(List<Integer> ll : adj){
            int from = ll.get(0);
            int to = ll.get(1);
            int cost = ll.get(2);
            List<Integer> insides = new ArrayList<>();
            insides.add(to);
            insides.add(cost);
            list.get(from).add(insides);
            List<Integer> insidesInverted = new ArrayList<>();
            insidesInverted.add(from);
            insidesInverted.add(cost);
            list.get(to).add(insidesInverted);

        }
        System.out.println(list);
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        boolean[] visited = new boolean[V];
        pq.add(new Pair(0,0));
        int sum = 0;
        while (!pq.isEmpty()){
            Pair pair = pq.remove();
            int node = pair.node;
            int weight = pair.weight;
            if (visited[node]) continue;
            visited[node]=true;
            sum+=weight;
           for (List<Integer> l : list.get(node)){
               int val = l.get(0);
               int wt = l.get(1);
               if (!visited[val]){
                   pq.add(new Pair(val,wt));
               }
           }
        }
        return sum;
    }
    public static void main(String[] args) {

        int V = 4;
        List<List<Integer>> edges = new ArrayList<>();
        edges.add(Arrays.asList(0, 1, 1));
        edges.add(Arrays.asList(1, 2, 2));
        edges.add(Arrays.asList(2, 3, 3));
        edges.add(Arrays.asList(0, 3, 4));


        List<List<List<Integer>>> list = new ArrayList<>();
        System.out.println(spanningTree(V,edges));
    }
}
