package OOPS.paperpractice;

class share{
    double resource;
    share(){
        this.resource=0;
    }
    public synchronized void increment(){
        resource++;
    }
    public synchronized void decrement(){
        resource--;
    }
    public synchronized double getval(){
        return  resource;
    }

}
class first extends Thread{
    share resource;
   public first(share resource){
       this.resource=resource;
    }
    public void run(){
       for(int i = 0 ; i < 10 ; i++){
           resource.increment();
           System.out.println(resource.getval());
       }
    }
}
class second extends Thread{
    share resource;
    public second(share resource){
        this.resource=resource;
    }
    public void run(){
        for(int i = 0 ; i < 10 ; i++){
            resource.decrement();
            System.out.println(resource.getval());
        }
    }
}
public class res {
    public static void main(String[] args) throws InterruptedException {
        share sh = new share();
        first firr = new first(sh);
        second secc = new second(sh);
        firr.start();
        secc.start();
        firr.wait();
        secc.wait();

    }
}
