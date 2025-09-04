//package StacksANDQueues;
//
//class Stack {
//    private final int max_size = 1000;
//    int top = -1;
//    int[] st = new int[max_size];
//    int curr_size = 0;
//
//    boolean push(int x){
//        if(curr_size>=max_size-1) return false;
//        else{
//            top=top+1;
//            st[top] = x;
//            curr_size++;
//            System.out.println(x + " pushed into the stack ");
//        }
//        return true;
//    }
//    int pop(){
//        int p;
//        if(top==-1 || curr_size<1) return 0;
//        else{
//            p = st[top];
//            top=top-1;
//            curr_size--;
//
//        }
//        return p;
//    }
//    int size(){
//        return top+1;
//    }
//    void print(){
//        for(int i = top ; i >= 0 ; i--){
//            System.out.println(st[top] + " ");
//        }
//    }
//
//
//}
//public class StackUsingArray {
//    public static void main(String[] args) {
//        Stack st = new Stack();
//        st.push(1);
//        st.push(2);
//        st.push(3);
//        System.out.println(st.pop() + " popped from the stack ");
//        System.out.println(st.pop() + " popped from the stack ");
//        System.out.println("Size of stack : " + st.size());
//        st.print();
//    }
//}