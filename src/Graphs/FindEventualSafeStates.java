package Graphs;

import java.util.*;

public class FindEventualSafeStates {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int[] inDegree = new int[graph.length];
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0 ; i < graph.length ; i++){
            list.add(new ArrayList<>());
        }
        for (int i = 0 ; i < graph.length;i++){
            for (int j  : graph[i]){
                list.get(i).add(j);
            }
        }
        System.out.println(list);
        List<List<Integer>> reversedGraph = new ArrayList<>();
        for (int i = 0 ; i < list.size();i++){
            reversedGraph.add(new ArrayList<>());
        }
        for (int i = 0 ; i < list.size();i++){
            for (int j  : list.get(i)){
                reversedGraph.get(j).add(i);
            }
        }
        System.out.println(reversedGraph);
        for (List<Integer> integers : reversedGraph) {
            for (int j : integers) {
                inDegree[j]++;
            }
        }
        System.out.println(Arrays.toString(inDegree));
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0 ; i < inDegree.length;i++){
            if (inDegree[i]==0) q.add(i);
        }
        List<Integer> res = new ArrayList<>();
        while (!q.isEmpty()){
            int node = q.remove();
            res.add(node);
            for (int i : reversedGraph.get(node)){
                inDegree[i]--;
                if (inDegree[i]==0) q.add(i);
            }
        }
        Collections.sort(res);
        return res;
    }
    public void main(String[] args) {
      int[][] graph =   { { },{0,2,3,4},{3},{4},{ } };
        System.out.println(eventualSafeNodes(graph));
    }
}
