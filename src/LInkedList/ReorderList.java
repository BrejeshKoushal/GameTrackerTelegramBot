package LInkedList;

import java.util.ArrayList;
import java.util.List;


public class ReorderList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public void reorderList(ListNode head) {
        List<ListNode> list = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            list.add(temp);
            temp = temp.next;
        }
        int i = 0;
        int j = list.size()-1;
        while(i<j){
           list.get(i).next = list.get(j);
            i++;
            if (i==j) break;
            list.get(j).next = list.get(i);
            j--;
        }
        list.get(i).next=null;

    }

    public  void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        reorderList(node);
        while (node!=null){
            System.out.print(node.val + " -> ");
            node=node.next;
        }
    }


}
