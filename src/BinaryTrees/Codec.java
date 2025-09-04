//package BinaryTrees;
//
package BinaryTrees;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Codec {

    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int x) {
            val = x;
        }
    }

    TreeNode root; // for display

    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            TreeNode node = q.remove();
            if (node == null) {
                sb.append("null ");
            } else {
                sb.append(node.val).append(" ");

                if (node.left != null) {
                    q.offer(node.left);
                } else {
                    q.offer(null);
                }

                if (node.right != null) {
                    q.offer(node.right);
                } else {
                    q.offer(null);
                }
            }
        }
        return sb.toString();
    }

    public TreeNode deserialize(String data) {
        if (data == null || data.isEmpty()) return null;

        String[] st = data.trim().split("\\s+");
        if (st[0].equals("null")) return null;

        TreeNode root = new TreeNode(Integer.parseInt(st[0]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int i = 1;

        while (!queue.isEmpty() && i < st.length) {
            TreeNode current = queue.poll();

            // Left child
            if (i < st.length && !st[i].equals("null")) {
                current.left = new TreeNode(Integer.parseInt(st[i]));
                queue.offer(current.left);
            }
            i++;

            // Right child
            if (i < st.length && !st[i].equals("null")) {
                current.right = new TreeNode(Integer.parseInt(st[i]));
                queue.offer(current.right);
            }
            i++;
        }

        this.root = root; // For display
        return root;
    }


    public void displayTree() {
        display(root, 0);
    }

    public void display(TreeNode node, int level) {
        if (node == null) {
            return;
        }
        display(node.right, level + 1);
        if (level != 0) {
            for (int i = 0; i < level; i++) {
                System.out.print("  ");
            }
            System.out.println("+-" + node.val);
        } else {
            System.out.println("  |");
            System.out.println("+-" + node.val);
            System.out.println("  |");
        }
        display(node.left, level + 1);
    }

    public static void main(String[] args) {
        Codec codec = new Codec();
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.right.left = new TreeNode(4);
        node.right.right = new TreeNode(5);

        String ss = codec.serialize(node);
        System.out.println("Serialized: " + ss);

        TreeNode nn = codec.deserialize(ss);
        System.out.println("\nDeserialized Tree Structure:");
        codec.displayTree();
    }
}

//import com.sun.source.tree.Tree;
//
//import java.net.HttpRetryException;
//import java.util.Arrays;
//import java.util.LinkedList;
//import java.util.Queue;
//
//public class Codec {
//    // Encodes a tree to a single string.
////    public void serializer(TreeNode root , StringBuilder sb){
////        if(root==null){
////            sb.append("null");
////            return;
////        }
////        sb.append(root.val);
////        serializer(root.left,sb);
////        serializer(root.right,sb);
////    }
//    public String serialize(TreeNode root) {
//        StringBuilder sb = new StringBuilder();
//        Queue<TreeNode> q = new LinkedList<>();
//        q.offer(root);
//        while(!q.isEmpty()){
//            TreeNode node = q.remove();
//            if(node==null){
//                sb.append("null");
//                sb.append(" ");
//            }
//            else {
//                int val = node.val;
//                sb.append(val);
//                sb.append(" ");
//
//                if (node.left != null) {
//                    q.offer(node.left);
//                }
//                if (node.left == null) {
//                    q.offer(null);
//                }
//                if (node.right != null) {
//                    q.offer(node.right);
//                }
//                if (node.right == null) {
//                    q.offer(null);
//                }
//            }
//        }
//        return sb.toString();
//    }
//
//    // Decodes your encoded data to tree.
//      public TreeNode deserialize(String data) {
//        TreeNode root = null;
//        String[] st = data.trim().split("\\s+");
//          System.out.println(Arrays.toString(st));
//          int i = 0;
//
//          while(i<st.length){
//              if(st[i].equals("null")){
//                  continue;
//              }
//              else{
//                  int val = Integer.parseInt(st[i]);
//                   root = new TreeNode(val);
//                  if(!st[2*i+1].equals("null")){
//                      root.left = new TreeNode(Integer.parseInt(st[2*i+1]));
//                  }
//                  else{
//                      root.left=null;
//                  }
//                  if(!st[2*i+2].equals("null")) {
//                      root.right = new TreeNode(Integer.parseInt(st[2 * i + 2]));
//                  }
//                  else{
//                      root.right=null;
//                  }
//              }
//              i++;
//          }
//          return root;
//    }
//
//    public  void main(String[] args) {
//        TreeNode node = new TreeNode(1);
//        node.left=new TreeNode(2);
//        node.right=new TreeNode(3);
//        node.right.left=new TreeNode(4);
//        node.right.right=new TreeNode(5);
//        String ss = serialize(node);
//        System.out.println(ss);
//        TreeNode nn = deserialize(ss);
//
//    }
//}
