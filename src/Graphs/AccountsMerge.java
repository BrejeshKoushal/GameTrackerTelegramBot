package Graphs;

import Graphs.DisjointSet.DisjointSet;

import javax.print.attribute.standard.DialogTypeSelection;
import java.util.*;

public class AccountsMerge {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        List<List<String>> ans = new ArrayList<>();
        int n = accounts.size();
        DisjointSet ds = new DisjointSet(n);
        Map<String,Integer> mapMailNode = new HashMap<>();
        for (int i = 0 ; i < n ; i++){
            for (int j = 1 ; j < accounts.get(i).size(); j++){
                String mail = accounts.get(i).get(j);
                if (!mapMailNode.containsKey(mail)){
                    mapMailNode.put(mail,i);
                }
                else ds.unionBySize(i,mapMailNode.get(mail));
            }
        }
        ArrayList<String>[] mergedMails = new ArrayList[n];
        for (int i = 0 ; i < n ; i++){
            mergedMails[i] =  new ArrayList<String>();
        }
        for (Map.Entry<String,Integer> e : mapMailNode.entrySet()){
            String mail = e.getKey();
            int node = ds.findUltimateParent(e.getValue());
            mergedMails[node].add(mail);
        }
        for (int i= 0 ; i < n ; i++){
            if (mergedMails[i].isEmpty()) continue;
            Collections.sort(mergedMails[i]);
            List<String> temp = new ArrayList<>();
            temp.add(accounts.get(i).getFirst());
            temp.addAll(mergedMails[i]);
            ans.add(temp);
        }
        return ans;
    }
}
