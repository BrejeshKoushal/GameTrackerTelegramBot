package BinaryTrees;

import com.sun.source.tree.Tree;

import java.util.*;

public class PreOrderTraveral {
    public static void main(String[] args) {

    }
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> q = new Stack<>();
        List<Integer> list = new ArrayList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode temp = q.pop();
            list.add(temp.val);
           if(temp.right!=null){
               q.add(temp.left);
           }
           if(temp.left!=null){
               q.add(temp.right);
           }
        }
        return list;
    }
}
