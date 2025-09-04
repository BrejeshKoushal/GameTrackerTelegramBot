package LInkedList;

import java.util.HashSet;

public class SingleLL {

    private Node head;
    private Node tail;
    private int size;
    public SingleLL(){
        this.size=0;
    }
    public void insertFirst(int value){
        Node node = new Node(value);
        node.next=head;
        head = node;

        if(tail==null){
            tail=head;
        }
        size+=1;
    }
    public void insertLast(int value){
        Node node = new Node(value);
        if(tail==null){
            insertFirst(value);
        }
        tail.next=node;
        tail = node;
        size+=1;
    }
    public void insert(int value,int index){
        if(index==0){
            insertFirst(value);
            return;
        }
        if(index==size){
            insertLast(value);
            return;
        }
        Node temp = head;
        for(int i = 1 ; i < index;i++){
            temp=temp.next;
        }
        Node node = new Node(value);
        node.next=temp.next;
        temp.next=node;
        size++;
        }
        public void deleteFirst(){
        int ptr = head.value;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
            System.out.println(STR."\{ptr} is being removed.");
        }

        public void deleteLast(){
        if(size<=1){
            deleteFirst();
        }
        int ptr = tail.value;
        Node temp = head;
        for(int i = 1 ; i < size-1;i++){
            temp=temp.next;
        }
        tail = temp;
        tail.next=null;
        size--;
            System.out.println(STR."\{ptr} is being removed.");
        }
        public void delete(int index){
        if(index==0){
            deleteFirst();
        }
        if(index==size-1){
            deleteLast();
        }
        Node ptr = head;
        for(int i = 1 ; i <index ;i++){
            ptr=ptr.next;
        }
        int value = ptr.next.value;
        ptr.next=ptr.next.next;
        System.out.println(STR."\{value} is being removed.");
        size--;
        }

    public void Display(){
        Node ptr = head;
        while(ptr!=null){
            System.out.print(STR."\{ptr.value}-> ");
            ptr = ptr.next;
        }
        System.out.println(" END ");
    }
    private static class Node{
        private int value;
        private Node next;
        public Node(int value){
            this.value=value;
        }

    }
}
