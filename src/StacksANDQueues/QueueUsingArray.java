package StacksANDQueues;
class Queue{
    private final int max_size = 1000;
    int front = -1;
    int rear = -1;
    int curr_size = 0;

    int[] que = new int[max_size];

    void push(int x){
        if(front==-1 && rear == -1){
            front = 0;
            rear = 0;
            que[rear] = x;
        }
        else if(curr_size==max_size-1){
            System.out.println("Queue is Full");
        }
        else{
            que[++rear] = x;
            curr_size++;
        }
        System.out.println(x + " pushed into the queue ");
    }
    int pop(){
        int x = 0;
        if(front>rear){
            System.out.println("Queue is Empty");
        }

        else {
            x = que[front];
            front++;
            curr_size--;
        }
        return x;

        }
        int size(){
        return rear-front+1;
        }
        void print(){
        for(int i = front ; i<=rear ;i++){
            System.out.println(que[i]);
        }
        }

}
public class QueueUsingArray {
    public static void main(String[] args) {
        Queue que = new Queue();
        que.push(10);
        que.push(20);
        que.push(30);
        System.out.println(que.pop() + " popped from the queue ");
        System.out.println(que.pop() + " popped from the queue ");
        System.out.println("Size of queue : " + que.size());
        que.print();
    }
}
