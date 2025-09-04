package LInkedList;

public class CircularLL {
    private Node head;
    private Node tail;
    public int size;
    public CircularLL(){
        this.size=0;
    }
    public void insert(int value){
        Node node = new Node(value);
        if(head==null){
            head=node;
            tail=node;
            return;
        }
        tail.next=node;
        node.next=head;
        tail = node;
        size++;
    }
    public void display(){
        Node temp = head;
       if(head!=null){
           do{
               System.out.print(temp.value + "-> ");
               temp=temp.next;
           }
           while(temp!=head);
       }
        System.out.println("END");

    }
    public void delete(int value){
        Node temp = head;
        if(temp==null){
            return;
        }
        if(temp.value==value){
            head=head.next;
            tail.next=head;
            return;
        }
        do{
            Node n = temp.next;
            if(n.value==value){
                temp.next=n.next;
                break;
            }
            temp=temp.next;
        }
        while(temp!=head);

    }
    private static class Node{
        private Node next;
        final int value;

        private Node(int value){
            this.value=value;
        }
    }
}
