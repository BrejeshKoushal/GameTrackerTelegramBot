package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumWidthOfABinaryTree {
    private static class Pair{
        int num;
        TreeNode node;
        Pair( TreeNode node,int num){
            this.num=num;
            this.node=node;
        }
    }

    public int widthOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        int ans = 0;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root,1));
        while(!q.isEmpty()){
            int size = q.size();
            int min = q.peek().num;
            int first=0,last = 0;
            for(int i = 0 ; i < size ; i++){
                assert q.peek() != null;
                int curr = q.peek().num-min;
                TreeNode node = q.peek().node;
                if(i==0) first = curr;
                if(i==size-1) last = curr;
                if(node.left!=null) q.add(new Pair(node.left,curr*2));
                if(node.right!=null) q.add(new Pair(node.right,curr*2+1));
            }
            ans = Math.max(ans,last-first+1);
        }
        return ans;
    }
    public static void main(String[] args) {

    }
}
