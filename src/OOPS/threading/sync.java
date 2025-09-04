package OOPS.threading;

class sharedresource{
    int share;
    sharedresource(){
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
class thread1 extends Thread{
sharedresource share;
public thread1(sharedresource share){
    this.share=share;
}
public void run(){
    for(int i = 0 ; i < 5 ;i++){
        share.increment();
        System.out.println(share.getval());
    }
}
}
class thread2 extends Thread{
    sharedresource share;
    public thread2(sharedresource share){
        this.share=share;
    }
    public void run(){
        for(int i = 0 ; i < 5 ;i++){
            share.decrement();
            System.out.println(share.getval());
        }
    }
}


public class sync {
    public static void main(String[] args) throws InterruptedException {
        sharedresource sh = new sharedresource();
        thread1 t1 = new thread1(sh);
        thread2 t2 = new thread2(sh);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(sh.getval());

    }
}
