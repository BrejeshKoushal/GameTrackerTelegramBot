package OOPS.Interface;

import java.util.Scanner;

abstract class student{
    int roll;
    int regno;
    void getinput(){
        Scanner scanner = new Scanner(System.in);
        roll = scanner.nextInt();
        regno = scanner.nextInt();
    }
    void display(){
        System.out.println(roll);
        System.out.println(regno);
    }
    abstract void course();
}
class kiitian extends student{
    void  course(){
        System.out.println("cse");
    }
}
public class abstractclass {
    public static void main(String[] args) {
        student s = new kiitian();
        s.getinput();
        s.display();
        s.course();
    }
}
