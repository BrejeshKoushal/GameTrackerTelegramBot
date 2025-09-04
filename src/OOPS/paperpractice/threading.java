package OOPS.paperpractice;

import java.util.Scanner;

class thread1 extends Thread{
    int start,end;
    thread1(int start , int end){
        this.start=start;
        this.end=end;
    }
    public void run(){
        for(int i =start ; i<end ;i++){
            System.out.println(i);
            try {
                thread1.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class threading {
    public static void main(String[] args) {
        thread1 th = new thread1(10,15);
        String name = "first";
        th.start();



    }
}
