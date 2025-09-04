package GraphsKiPractice;

import java.util.*;

public class MInTime {
    static class Pair{
        int node;
        int time;

        public Pair(int node, int time) {
            this.node = node;
            this.time = time;
        }
    }
    public static int[] minimumTime(int n, int m, int[][] edges) {
        boolean[] vis = new boolean[n];
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<>());
        }

        for (int[] it : edges) {
            int from = it[0]; // 1-based
            int to = it[1];   // 1-based
            list.get(from - 1).add(to); // from-1 because list is 0-indexed, to stays 1-based
        }

        System.out.println(list);

        int[] inD = new int[n];
        for (List<Integer> neighbors : list) {
            for (int it : neighbors) {
                inD[it - 1]++; // it is 1-based, so subtract 1
            }
        }
        Queue<Pair> q = new LinkedList<>();
        for (int i = 0 ; i < inD.length;i++){
            if (inD[i]==0) q.add(new Pair(i,1));
        }
        System.out.println(Arrays.toString(inD));
        int[] ans = new int[n];
        while (!q.isEmpty()){
            Pair pair = q.remove();
            int node = pair.node;
            int time = pair.time;
            ans[node]=time;
            for (Integer it : list.get(node)){
                inD[it-1]--;
                if(inD[it-1]==0){
                    q.add(new Pair(it-1,time+1));
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] edges = {{1,2},{2,3},{2,4},{2,5},{3,6},{4,6},{5,7}};

        int n = 7;
        int m = 7;
        System.out.println(Arrays.toString(minimumTime(n, m, edges)));
    }
}
