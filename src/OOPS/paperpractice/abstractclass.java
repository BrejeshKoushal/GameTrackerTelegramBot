package OOPS.paperpractice;

import java.util.Scanner;

abstract class student{
    int roll;
    int reg;
    void getinput(int roll,int reg){
        this.roll=roll;
        this.reg=reg;
    }
    void show(){
        System.out.println(roll+" "+reg);
    }
abstract void course();
}
class kiitian extends student{
    void course(){
        System.out.println("BTech");
    }
}

public class abstractclass {
    public static void main(String[] args) {
        kiitian obj = new kiitian();
        obj.getinput(22,4243);
        obj.show();
        obj.course();
    }
}
