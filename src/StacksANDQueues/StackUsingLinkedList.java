package StacksANDQueues;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}
    class StackUsingLL{
        Node head = null;
        void push(int x){
            Node node = new Node(x);
            node.next = head;
            head = node;
            System.out.println(STR."\{x} pushed into the Stack ");
        }
        int pop(){
            Node temp = head;
            if(head == null) return 0;
            else{
                head = head.next;
            }
            return temp.data;
        }
        int peek(){
            return head.data;
        }
    }


public class StackUsingLinkedList {
    public static void main(String[] args) {
        StackUsingLL st = new StackUsingLL();
        st.push(10);
        st.push(20);
        st.push(30);
        System.out.println(st.pop() + " popped from the Stack ");
        System.out.println(st.pop() + " popped from the Stack ");
        System.out.println("Top Value : " + st.peek());
    }
}
