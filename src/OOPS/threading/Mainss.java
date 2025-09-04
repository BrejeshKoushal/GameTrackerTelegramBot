package OOPS.threading;
class counter{
    int count =0;
    public synchronized void  increment(){
        count++;
    }
}
class Ran implements Runnable{
    public void run(){
        counter c = new counter();
        for(int i = 1 ; i <=1000 ;i++){
            c.increment();

        }
    }
}
class Gan implements Runnable{
    public void run(){
        counter c = new counter();
        for(int i = 1 ; i <=1000 ;i++){

            c.increment();
        }
    }
}
public class Mainss {
    public static void main(String[] args) throws InterruptedException {
        Runnable Ran = new Ran();
        Runnable Gan = new Gan();
        counter c = new counter();
        Thread t1 = new Thread(Ran);
        Thread t2 = new Thread(Gan);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(c.count);
    }
}
