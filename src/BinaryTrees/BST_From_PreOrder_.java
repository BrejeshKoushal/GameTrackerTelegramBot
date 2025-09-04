package BinaryTrees;

import java.util.Stack;



public class BST_From_PreOrder_ {
    public TreeNode root;

    public TreeNode bstFromPreorder(int[] preorder) {
        Stack<TreeNode> st = new Stack<>();
        root = new TreeNode(preorder[0]);
        st.push(root);
        int i = 1;
        while (!st.isEmpty() && i < preorder.length) {
            TreeNode peeked = st.peek();
            if (preorder[i] < peeked.val) {
                TreeNode newNode = new TreeNode(preorder[i]);
                st.push(newNode);
                peeked.left = newNode;
                i++;
            } else {
                TreeNode ifGreaterPeek = null;
                while (!st.isEmpty() && st.peek().val < preorder[i]) {
                    ifGreaterPeek = st.pop();
                }
                TreeNode newNode = new TreeNode(preorder[i]);
                st.push(newNode);
                if (ifGreaterPeek != null) {
                    ifGreaterPeek.right = newNode;
                }
                i++;
            }
        }
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
            System.out.println(STR."+-\{node.val}");
        } else {
            System.out.println("  |");
            System.out.println(STR."+-\{node.val}");
            System.out.println("  |");
        }
        display(node.left, level + 1);
    }

    public void main(String[] args) {
        int[] preorder = {10, 7, 5, 9, 20, 15, 30};
        bstFromPreorder(preorder);
        displayTree();
    }
}
