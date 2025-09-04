package OOPS.threading;
class C implements Runnable{
    public void run(){
        for(int i = 0 ; i <10 ;i++){
            System.out.println("HI");
            try{
                Thread.sleep(10);
            }
            catch(InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }
}
class D implements Runnable{
    public void run(){
        for(int i = 0 ; i <10 ;i++){
            System.out.println("Hello");
            try{
                Thread.sleep(10);
            }
            catch(InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }
}
public class Mains {
    public static void main(String[] args) {
        Runnable C = new C();
        Runnable D = new D();
        Thread t1 = new Thread(C);
        Thread t2 = new Thread(D);
        t1.start();
        t2.start();
    }
}
