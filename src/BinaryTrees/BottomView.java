package BinaryTrees;

import javax.print.attribute.IntegerSyntax;
import java.util.*;

public class BottomView {
    public static void main(String[] args) {


    }
    public ArrayList<Integer> bottomView(Node root)
    {
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Pair> q = new LinkedList<>();
        TreeMap<Integer,Integer> map = new TreeMap<>();
        q.add(new Pair(root,0));
        while(!q.isEmpty()){
            Pair pair = q.poll();
            int vert = pair.vert;
            Node node = pair.node;
            int data = node.data;
            if(root.left!=null) {
                q.add(new Pair(root.left,vert-1));
            }
            if(root.right!=null) {
                q.add(new Pair(root.right, vert + 1));
            }

            map.put(vert,data);
        }
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            list.add(e.getValue());
        }
        return list;
    }

}
