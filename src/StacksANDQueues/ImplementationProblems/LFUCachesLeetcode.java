package StacksANDQueues.ImplementationProblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

class LFUCache {
    int capacity;
//    to store the minimum freq:::Which node has the least frequency
    int minFreq;
//    Just like LFU cache problem, initialize a key-Node pair:::(Node gives the address of the Node in DLL)
    HashMap<Integer,Node> keyToNode;
//    LinkedHashSet maintains the order of the elements unlike HashMap
//    Keys corresponds to the frequency:::::LinkedHashSet why? because it maintains the order of the nodes within -
//    - the frequency
//    :::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
//    we come we search for element keyToNode will give us the address as simple as that
//    we come we want to put an element or cache whatever.... we see arey the capacity of keyToNode hashmap is same as
//    -that of the cache capacity now what we want cache with the least frequency okay that's good we could simply have seen
//    in the simple freqToNode hashmap okay that's good but if 3-4 caches have same frequency then what we would remove
//    the most recently used right that's why freqToLinkedHashSet is used ki the least freq we got but there are 3-4 elements,
//    but we have used LinkedHashset that's has cache in order, so we simply remove the first one from that
//    and agar wo only node hai with the least freq then we increment the minFreq ki now the min freq is 2-3 see the nodes in that
//    and uske baad we would simply get or put jaise we want
    HashMap<Integer, LinkedHashSet<Node>> freqToNode;
    public static class Node{
        int key;
        int value;
        int count;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
            this.count = 1;
        }
    }
    public LFUCache(int capacity) {
        this.capacity=capacity;
        this.minFreq=0;
        this.keyToNode = new HashMap<>();
        this.freqToNode = new HashMap<>();

    }

    public int get(int key) {
//        keyTonode doesnt contains key return -1
        if(!keyToNode.containsKey(key)) return -1;
//        if contains key::get its count/frequency of that node
        Node node = keyToNode.get(key);
        int oldFreq = node.count;
//      freqNode map->remove that node and if it was the only node with that freq then delete freq mapping-->
//        frequency       HashSet
//          1             A   (only element whose count is 1 so remove this whole key value pair else remove first element only)
//          2             B->C->D->E

        freqToNode.get(oldFreq).remove(node); // node has the address of node & oldfreq has count of key so we can remove that element in O(1) time
        if(freqToNode.get(oldFreq).isEmpty()){ // agar remove karne ke baad that key does not contain any value remove that key now theres no element with that freq
            freqToNode.remove(oldFreq);
        }
        if(minFreq==oldFreq) minFreq++; //means ki sorted order mei we storing pairs and first key would have min freq then if
        node.count++;    //node ki count badhao and  new frequency set mei add kro
        freqToNode.computeIfAbsent(node.count,k->new LinkedHashSet<>()).add(node);
//        computeIfAbsent---what does it do:::it checks if freq map mei with that count any key is there if hao to usme add krdega
//        and if not toh it will create a new hashset
        return node.value;
    }

    public void put(int key, int value) {
        if(capacity==0) return;
        if(keyToNode.containsKey(key)){
            Node node = keyToNode.get(key);
            node.value=value; // node ki value ko update krdo
            get(key); // get key call kiya because wo freq update and freqset mei wapis daaldega no need to again do all that

            return;
        }
        if(keyToNode.size()>=capacity){
            Node removedNode = freqToNode.get(minFreq).getFirst(); //simple hai first node ko remove krdo
            freqToNode.get(minFreq).remove(removedNode);
            if (freqToNode.get(minFreq).isEmpty()){
                freqToNode.remove(minFreq);
            }
            keyToNode.remove(removedNode.key);
        }
        Node newNode = new Node(key,value);
        keyToNode.put(key,newNode);
        freqToNode.computeIfAbsent(newNode.count,k->new LinkedHashSet<>()).add(newNode);
        minFreq = 1;
    }
}
