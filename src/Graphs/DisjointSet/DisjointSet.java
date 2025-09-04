package Graphs.DisjointSet;

import java.util.ArrayList;
import java.util.List;

public class DisjointSet{
     public List<Integer> rank = new ArrayList<>();
     public List<Integer> parent = new ArrayList<>();
     public List<Integer> size = new ArrayList<>();
     public DisjointSet(int n){
         for (int i = 0 ; i <= n ;i++){
             rank.add(0);
             parent.add(i);
             size.add(1);
         }
     }
     public int findUltimateParent(int node){
         if (node==parent.get(node)){
             return node;
         }
         int ultParent = findUltimateParent(parent.get(node));
         parent.set(node,ultParent);
         return parent.get(node);
     }
     public void unionBySize(int u , int v){
         int ultParent_u = findUltimateParent(u);
         int ultParent_v = findUltimateParent(v);
         if (ultParent_v == ultParent_u) return;
         if (size.get(ultParent_u) < size.get(ultParent_v)){
             parent.set(ultParent_u,ultParent_v);
             size.set(ultParent_v,size.get(ultParent_v)+size.get(ultParent_u));
         }
         else {
             parent.set(ultParent_v,ultParent_u);
             size.set(ultParent_u,size.get(ultParent_v)+size.get(ultParent_u));
         }
     }
     public void unionByRank(int u , int v){
         int ultParent_u = findUltimateParent(u);
         int ultParent_v = findUltimateParent(v);
         if (ultParent_v == ultParent_u) return;
         if (rank.get(ultParent_u) > rank.get(ultParent_v)){
             parent.set(ultParent_v,ultParent_u);
         }
         else if (rank.get(ultParent_u) < rank.get(ultParent_v)){
             parent.set(ultParent_u,ultParent_v);
         }
         else {
             parent.set(ultParent_v,ultParent_u);
             int rankU = rank.get(ultParent_u);
             rank.set(ultParent_u,rankU+1);
         }
     }
}
