package BinaryTrees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InOrderTraversal {
    public static void main(String[] args) {

    }
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> st = new Stack<>();
        List<Integer> list = new ArrayList<>();
        TreeNode temp = root;
        while(true){
            if(temp!=null) {
                st.push(temp);
                temp = temp.left;
            }
            else{
                if(st.isEmpty()) break;
                temp = st.pop();
                list.add(temp.val);
                temp=temp.right;
            }
        }
        return list;
    }
}
