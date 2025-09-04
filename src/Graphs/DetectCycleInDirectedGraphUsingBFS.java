package Graphs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class DetectCycleInDirectedGraphUsingBFS {
    public boolean isCyclic(int V, int[][] adj) {
        Queue<Integer> q  = new LinkedList<>();
        int[] inDegree = new int[V];
        for (int[] ints : adj) {
            for (int j : ints) {
                inDegree[j]++;
            }
        }
        System.out.println(Arrays.toString(inDegree));
        for (int i = 0 ; i < V ; i++ ){
            if (inDegree[i]==0) q.add(i);
        }

        int k=0;
        while (!q.isEmpty()){
            int node = q.remove();
            k++;
            for (int i : adj[node]){
                inDegree[i]--;
                if (inDegree[i]==0){
                    q.add(i);
                }
            }
        }
        return k != V;
    }
    public void main(String[] args) {
        int V = 6;
        int[][] adj= { {1}, {2, 5}, {3}, {4}, {1}, { } };
        System.out.println(isCyclic(V,adj));
    }
}
