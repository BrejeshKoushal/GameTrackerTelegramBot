package OOPS.threading;

class A extends Thread{
    public void run(){
        for(int i = 0 ; i<10 ;i++){
            System.out.println("Hi");

                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i = 0 ; i < 10 ; i++){
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

public class Main {
    public static void main(String[] args) {
        A obj = new A();
        obj.getPriority();
        obj.setPriority(Thread.MAX_PRIORITY);
        System.out.println(obj.getName());
        B obj1 = new B();
        obj.getPriority();
        System.out.println(obj.getName());
        obj.start();
        obj1.start();
    }
}
