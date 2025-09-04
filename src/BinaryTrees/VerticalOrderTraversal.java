package BinaryTrees;

import com.sun.source.tree.Tree;

import java.util.*;

class Tuple{
    TreeNode node;
    int row;
    int col;
    public Tuple(TreeNode node , int row , int col){
        this.node = node;
        this.col  = col;
        this.row = row;
    }
}
public class VerticalOrderTraversal {
    public static void main(String[] args) {

    }

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
        Queue<Tuple> q = new LinkedList<Tuple>();
        q.add(new Tuple(root,0,0));
        while(!q.isEmpty()){
            Tuple tuple = q.poll();
            TreeNode node = tuple.node;
            int vertical = tuple.row;
            int level = tuple.col;
            if(!map.containsKey(vertical)){
                map.put(vertical,new TreeMap<>());
            }
            if(!map.get(vertical).containsKey(level)){
                map.get(vertical).put(level,new PriorityQueue<>());
            }
            map.get(vertical).get(level).add(node.val);
            if(node.left!=null){
                q.add(new Tuple(node.left,vertical-1,level+1));
            }
            if(node.right!=null){
                q.add(new Tuple(node.right,vertical+1,level+1));
            }
        }
        List<List<Integer>> list = new ArrayList<>();
        for(TreeMap<Integer,PriorityQueue<Integer>> tt : map.values()){
            list.add(new ArrayList<>());
            for(PriorityQueue<Integer> nodes : tt.values()){
                while(!nodes.isEmpty()){
                    list.getLast().add(nodes.poll());
                }
            }
        }
        return list;
    }

}


