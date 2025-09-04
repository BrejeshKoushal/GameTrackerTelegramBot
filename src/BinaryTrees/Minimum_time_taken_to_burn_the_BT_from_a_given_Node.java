package BinaryTrees;

import com.sun.source.tree.Tree;

import java.util.*;

public class Minimum_time_taken_to_burn_the_BT_from_a_given_Node {

    public static class Pair{
        TreeNode node;
        int val;

        public Pair(TreeNode node , int val){
            this.node=node;
            this.val = val;
        }
    }
    HashMap<TreeNode,TreeNode> parent = new HashMap<>();
    TreeNode target;
    int max = 0;
      void parenting(TreeNode root){
          if(root==null) return;
          if(root.left!=null){
              parent.put(root.left,root);
          }
          parenting(root.left);
          if(root.right!=null){
              parent.put(root.right,root);
          }
          parenting(root.right);
      }
      void search(TreeNode root , int start){
          if(root==null || target!=null) return;
          if(root.val==start){
              target = root;
              return ;
          }
          search(root.left,start);
          search(root.right,start);
      }
      void BFS(TreeNode target ){
          if(target==null) return;
          Queue<Pair> q= new LinkedList<>();
          q.add(new Pair(target, 0));
          Set<Integer> visited = new HashSet<>();

          while(!q.isEmpty()) {
              int n = q.size();
              while (n-- > 0) {
                  Pair node_Pair = q.remove();
                  TreeNode node = node_Pair.node;
                  int level = node_Pair.val;
                  System.out.println("Visited node: " + node.val + " at time: " + level);
                  max = level;
                  System.out.println("max = " + level);
                  if (node.left != null && !visited.contains(node.left.val)) {
                      visited.add(node.left.val);
                      q.add(new Pair(node.left, level + 1));
                  }
                  if (node.right != null && !visited.contains(node.right.val)) {
                      visited.add(node.right.val);
                      q.add(new Pair(node.right, level + 1));
                  }
                  if (parent.containsKey(node) && !visited.contains(parent.get(node).val)) {
                      visited.add(parent.get(node).val);
                      q.add(new Pair(parent.get(node), level + 1));
                  }
              }
          }


      }
    public int timeToBurnTree(TreeNode root, int start) {
        //your code goes here
        search(root,start);
        parenting(root);
        BFS(target);
        System.out.println(target);
        return max;
    }

    public void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left=new TreeNode(2);
        node.right=new TreeNode(3);
        node.left.left=new TreeNode(4);
        node.left.left.right=new TreeNode(7);
        node.right.left=new TreeNode(5);
        node.right.right=new TreeNode(6);
        System.out.println(timeToBurnTree(node,5));

      }
}
