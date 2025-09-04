package Graphs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class KahnAlgo {
    public int[] topoSort(int V, int[][] adj) {
        int[] res = new int[V];
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
            res[k++] = node;
            for (int i : adj[node]){
                inDegree[i]--;
                if (inDegree[i]==0){
                    q.add(i);
                }
            }
        }
        return res;
    }
    public void main(String[] args) {
        int V = 6;
        int[][] adj={ { }, { }, {3}, {1}, {0,1}, {0,2} };
        System.out.println(Arrays.toString(topoSort(V, adj)));

    }
}
