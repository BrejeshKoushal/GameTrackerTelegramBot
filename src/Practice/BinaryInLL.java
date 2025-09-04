package Practice;

import BinaryTrees.TreeNode;
import LInkedList.SingleLL;

import java.util.Arrays;

public class BinaryInLL {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public static int getDec(StringBuilder num){
        int ans = 0;
        int power = 0;
        for (int i = num.length()-1 ; i>=0;i--){
            int bit = num.charAt(i)-'0';
            ans+= (int) (bit*Math.pow(2,power));
            power++;
        }
        return ans;
    }
    public static int getDecimalValue(ListNode  head) {
        ListNode temp = head;
        StringBuilder sb = new StringBuilder();
        while(temp!=null) {
            sb.append(temp.val);
            temp = temp.next;
        }
        return getDec(sb);
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(0);
        head.next.next = new ListNode(1);
        System.out.println();
        int[] arr = new int[11];
        System.out.println(getDecimalValue(head));

    }
}
