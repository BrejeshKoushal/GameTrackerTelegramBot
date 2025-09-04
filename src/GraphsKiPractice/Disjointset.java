package GraphsKiPractice;

import Graphs.DisjointSet.DisjointSet;

import java.util.ArrayList;
import java.util.List;

public class Disjointset {
    public List<Integer> size = new ArrayList<>();
    public List<Integer> parent = new ArrayList<>();
    public Disjointset(int n){
        for (int i = 0 ; i < n ; i++){
            size.add(1);
            parent.add(i);
        }
    }
    public int findUltParent(int node){
        if(parent.get(node)==node) return node;
        int ult = findUltParent(parent.get(node));
        parent.set(node,ult);
        return parent.get(node);
    }
    public void unionBySize(int u , int v){
        int ultParentU = findUltParent(u);
        int ultParentV = findUltParent(v);
        if(ultParentU==ultParentV){
            return;
        }
        else{
            if(size.get(ultParentU)>size.get(ultParentV)){
                parent.set(ultParentU,ultParentV);
                size.set(ultParentU,size.get(ultParentV)+size.get(ultParentU));
            }
            else{
                parent.set(ultParentV,ultParentU);
                size.set(ultParentV,size.get(ultParentU)+size.get(ultParentV));
            }
        }
    }
}
