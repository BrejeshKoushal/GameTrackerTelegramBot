package OOPS.threading;

import java.util.Scanner;

class thr extends Thread{
    int low;
    int high;
    thr(int low , int high){
        this.low=low;
        this.high=high;
    }
    public void run(){
        System.out.println(getName());
        for(int i = low ; i<=high;i++){
            System.out.println(i);
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


public class IDK {
    public static void main(String[] args) {
       thr obj = new thr(10,15);
       obj.setName("First");
       obj.start();



    }
}
