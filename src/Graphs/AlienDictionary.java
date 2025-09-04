package Graphs;

import java.util.*;

public class AlienDictionary {
    public List<Integer> topoSort(int V, List<List<Integer>> adj) {
        List<Integer> res = new ArrayList<>();
        Queue<Integer> q  = new LinkedList<>();
        int[] inDegree = new int[V];
        for (List<Integer> integers : adj) {
            for (int j : integers) {
                inDegree[j]++;
            }
        }
        System.out.println(Arrays.toString(inDegree));
        for (int i = 0 ; i < V ; i++ ){
            if (inDegree[i]==0) q.add(i);
        }
        while (!q.isEmpty()){
            int node = q.remove();
            res.add(node);
            for (int i : adj.get(node)){
                inDegree[i]--;
                if (inDegree[i]==0){
                    q.add(i);
                }
            }
        }
        return res;
    }
    public String findOrder(String [] dict, int N, int K) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0 ; i < dict.length;i++){
            list.add(new ArrayList<>());
        }
        for (int i = 0 ; i < N-1 ; i ++){
            String s1 = dict[i];
            String s2 = dict[i+1];
            int len = Math.min(s1.length(),s2.length());
            for (int j = 0 ;j<len;j++){
                if(s1.charAt(j)!=s2.charAt(j)){
                    list.get(s1.charAt(j)-'a').add(s2.charAt(j)-'a');
                    break;
                }
            }
        }
        System.out.println(list);
        List<Integer> topoOutput = topoSort(K,list);
        String str = "";
        for (int i : topoOutput){
            str=str + (char) (i+'a');
        }
        return str;
    }
    public void main(String[] args) {
      int N = 5, K = 4;
      String[] dict = {"baa","abcd","abca","cab","cad"};
        System.out.println(findOrder(dict,N,K));
    }
}
