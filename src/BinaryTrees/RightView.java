package BinaryTrees;

import binarysearch.PainterPartition;
import com.sun.source.tree.Tree;

import java.util.*;

public class RightView {
    public static void main(String[] args) {

    }
    private static class Pair{
        int vert;
        TreeNode treenode;
        Pair(TreeNode treenode,int vert){
            this.vert=vert;
            this.treenode=treenode;
        }
    }
    public List<Integer> rightSideView(TreeNode root) {
        Queue<Pair> q = new LinkedList<>();

        q.add(new Pair(root, 0));
        Map<Integer,Integer> map = new TreeMap<>();
        while(!q.isEmpty()){
            Pair pair = q.remove();
            TreeNode node = pair.treenode;
            int vert = pair.vert;
            int data = node.val;
            if(node.right!=null){
                q.add(new Pair(node.right,vert+1));
            }
            if(node.left!=null){
                q.add(new Pair(node.left,vert+1));
            }
            if(!map.containsKey(vert)){
                map.put(vert,data);
            }
        }
        List<Integer> list = new ArrayList<>();
        for(Map.Entry<Integer, Integer> e:map.entrySet()){
            list.add(e.getValue());
        }
        return list;
    }

}
