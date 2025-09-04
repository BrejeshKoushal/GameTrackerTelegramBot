package BinaryTrees;

import java.util.ArrayList;
import java.util.List;

public class InorderAndPreorderSuccessor {
    TreeNode inOrder  = null;
    public TreeNode inOrderSuccessor(TreeNode root,int key){
       while(root!=null){
           if(root.val>=key){
               root=root.left;
           }
           else{
               inOrder=root;
               root=root.right;
           }
       }
       return inOrder;
    }
    TreeNode postOrder = null;
    public TreeNode postOrderSuccessor(TreeNode root,int key){
        while(root!=null){
            if(root.val>key){
                postOrder=root;
                root=root.left;
            }
            else{
                root=root.right;
            }
        }
        return postOrder;
    }

    public List<Integer> succPredBST(TreeNode root, int key) {
        List<Integer> list = new ArrayList<>();
        TreeNode a = inOrderSuccessor(root,key);
        TreeNode b = postOrderSuccessor(root, key);
        if(a!=null && b!=null) {
            list.add(a.val);
            list.add(b.val);
        }
        if(a==null && b==null){
            list.add(-1);
            list.add(-1);
        }
        else if(a==null){
            list.add(-1);
            list.add(b.val);
        }
        else if(b==null){
            list.add(a.val);
            list.add(-1);
        }

        return list;
    }

    public void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left=new TreeNode(7);
        root.right = new TreeNode(20);
        root.left.left=new TreeNode(5);
        root.left.right = new TreeNode(9);
        root.right.left=new TreeNode(15);
        root.right.right=new TreeNode(30);
        System.out.println(succPredBST(root,7));
    }
}






//    List<Integer> succPredBST(TreeNode root, int key) {
//        //your code goes here
//        List<Integer> list = new ArrayList<>();
//        List<Integer> ans = new ArrayList<>();
//        inorder(root, list);
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i) == key) {
//                if (i < list.size() - 1) {
//                    ans.add(list.get(i - 1));
//                    ans.add(list.get(i + 1));
//                } else if (i == list.size() - 1) {
//                    ans.add(list.get(i - 1));
//                    ans.add(-1);
//                }
//            }
//        }
//
//        return ans;
//    }

