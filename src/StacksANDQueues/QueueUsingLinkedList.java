package StacksANDQueues;

class QueueUsingLL {
    Node front;
    Node rear;

    QueueUsingLL() {
        front = rear = null;
    }

    void push(int x) {
        Node node = new Node(x);
        if (front == null && rear == null) {
            front = node;
            rear = node;
        } else {
            rear.next = node;
            rear = rear.next;
        }
        System.out.println(x + " pushed into the stack ");
    }

    int pop() {
        Node temp = front;
        front = front.next;
        return temp.data;
    }

    void display() {
        Node temp = front;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}



public class QueueUsingLinkedList {
    public static void main(String[] args) {
        QueueUsingLL que = new QueueUsingLL();
        que.push(10);
        que.push(20);
        que.push(30);
        System.out.println(que.pop() + " popped out from the queue ");
        System.out.println(que.pop() + " popped out from the queue ");
        que.display();

    }
}
