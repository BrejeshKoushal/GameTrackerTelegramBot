package BinaryTrees;

import com.sun.source.tree.Tree;

import java.util.Stack;

public class BST_From_PreOrder {
    public TreeNode bstFromPreorder(int[] preorder) {
        Stack<TreeNode> st = new Stack<>();
        TreeNode root = new TreeNode(preorder[0]);
        st.push(root);
        int i = 1;
        while (!st.isEmpty() && i < preorder.length) {
            TreeNode peeked = st.peek();
            if (preorder[i] < peeked.val) {
                st.push(new TreeNode(preorder[i]));
                peeked.left = new TreeNode(preorder[i]);
                i++;
            } else {
                TreeNode ifGreaterPeek = null;
                while (!st.isEmpty() && peeked.val < preorder[i]) {
                    ifGreaterPeek = st.peek();
                    st.pop();
                }
                st.push(new TreeNode(preorder[i]));
                if (ifGreaterPeek != null) {
                    ifGreaterPeek.right = new TreeNode(preorder[i]);
                }
                i++;
            }
        }
        return root;
    }

    public  void main(String[] args) {
        int[]preorder=  {10,7,5,9,20,15,30};
        bstFromPreorder(preorder);

    }
}
