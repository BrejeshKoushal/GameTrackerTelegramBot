package Graphs.DisjointSet;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DisjointSet ds = new DisjointSet(7);
        ds.unionBySize(1,2);
        ds.unionBySize(2,3);
        ds.unionBySize(4,5);
        ds.unionBySize(6,7);
        ds.unionBySize(5,6);
        if (ds.findUltimateParent(3)==ds.findUltimateParent(7)){
            System.out.println("Same");
        }
        else System.out.println("Not Same");
        ds.unionBySize(3,7);
        if (ds.findUltimateParent(3)==ds.findUltimateParent(7)){
            System.out.println("Same");
        }
        else System.out.println("Not Same");
    }
}
