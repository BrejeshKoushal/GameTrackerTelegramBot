package StacksANDQueues.ImplementationProblems;
import java.util.HashMap;
import java.util.Map;

class LRUCache{
    static class Node{
        Node next;
        Node prev ;
        int value;
        int key;
        Node(int key , int value){
            this.key=key;
            this.value=value;
        }
    }
    int size;
    Map<Integer,Node> map = new HashMap<>();
    Node head = new Node(-1, -1);
    Node tail = new Node(-1, -1);

    public LRUCache(int capacity) {
        size = capacity;
        head.next=tail;
        tail.prev=head;
    }
    public void addNode(Node node){
        Node temp = head.next;
        head.next=node;
        node.prev=head;
        node.next=temp;
        temp.prev=node;
    }
    public void deleteNode(Node node){
        Node p = node.prev;
        Node n = node.next;
        p.next=n;
        n.prev=p;
    }
    public int get(int key) {
        if(map.containsKey(key)) {
            Node loc = map.get(key);
            map.remove(key);
            deleteNode(loc);
            addNode(loc);
            map.put(key,head.next);
            return loc.value;
        }
        return -1;

    }

    public void put(int key, int value) {
        Node node = new Node(key, value);
        if(map.containsKey(key)){
            Node loc = map.get(key);
            map.remove(key);
            deleteNode(loc);
        }
        else{
            if(map.size()==size){
                map.remove(tail.prev.key);
                deleteNode(tail.prev);
            }
        }
        addNode(node);
        map.put(key,head.next);
    }
}
public class LRUCachesLeetcode {
    public static void main(String[] args) {

    }
}
