package OOPS.paperpractice;
class shared{
    int share;
    shared(){
        this.share=0;
    }
    public synchronized void increment(){
        share++;
    }
    public synchronized void decrement(){
        share--;
    }
    public synchronized int getval(){
        return share;
    }


}
class X extends Thread{
    shared share;
    X(shared share){
        this.share=share;
    }
    public void run(){
        for(int i=0;i<5;i++){
            share.increment();
            System.out.println(share.getval());
        }
    }
}
class Y extends Thread{
    shared share;
    Y(shared share){
        this.share=share;
    }
    public void run(){
        for(int i=0;i<5;i++){
            share.decrement();
            System.out.println(share.getval());
        }
    }
}
public class synch {
    public static void main(String[] args) throws InterruptedException {
       shared sh = new shared();
       X x = new X(sh);
       Y y = new Y(sh);
       x.start();
       y.start();
       x.join();
       y.join();
        System.out.println(sh.getval());



    }
}
