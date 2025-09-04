package BinaryTrees;

public class CountCompleteBinaryTree {
    int countUptoLeaf = -1;
    public void helper(TreeNode rootA , TreeNode rootB){
        if(rootA==null || rootB==null) return;
        countUptoLeaf++;
        helper(rootA.left,rootB.left);
        helper(rootA.right,rootB.right);
    }
    public int countNodes(TreeNode root) {
        helper(root.left,root.right);
        return countUptoLeaf;
    }

    public  void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.left.left = new TreeNode(4);
        node.left.right = new TreeNode(5);
        node.right.left=new TreeNode(6);
        int num = countNodes(node);
        System.out.println(num);

    }
}
