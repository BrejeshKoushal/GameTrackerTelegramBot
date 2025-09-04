package LInkedList;

public class DoubleLL {
    private Node head;
    private Node tail;
    public int size;
    public DoubleLL(){
        this.size=0;
    }

    public void insertFirst(int value){
        Node node = new Node(value);
        node.prev=null;
        node.next=head;
        if(head!=null){
            head.prev=node;
        }
        head = node;
        if(tail==null){
            tail=head;
        }
        size++;
    }
    public void insertLast(int value){
        Node node = new Node(value);
        Node last = head;
        node.next=null;
        if(head==null){
            insertFirst(value);
        }
        while(last.next!=null){
        last=last.next;
        }
        last.next=node;
        node.prev=last;
        size++;
    }
    public void insert(int index , int value){
        Node node = new Node(value);
        Node ptr = head;
        if(index==0){
            insertFirst(value);
        }
        if(index==size-1){
            insertLast(value);
        }
        for(int i = 1 ; i < index ;i++){
            ptr=ptr.next;
        }
        node.next=ptr.next;
        ptr.next=node;
        ptr.next.prev=node;
        node.prev=ptr;
        size++;
    }
    public void reverse(){
        Node temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }
        do{
            System.out.print(temp.value+"--> ");
            temp=temp.prev;
        }while(temp!=null);
    }
    public void Display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(STR."\{temp.value} -> ");
            temp=temp.next;
        }
        System.out.println("END");
    }

    private static class Node{
       private Node next;
       private Node prev;
        final int value;
       private Node(int value){
           this.value=value;
       }
    }
}
