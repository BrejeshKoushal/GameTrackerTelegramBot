package practiceproblems;

import java.util.Scanner;

abstract class student{
    int roll;
    int regno;
    void getinput(){
        Scanner scanner = new Scanner(System.in);
        roll = scanner.nextInt();
        regno = scanner.nextInt();
    }
    abstract void course();
}
class kiitian extends student{
    String course;
    void course(){
        System.out.println("Studying at kiit");
    }
}


public class Main {
    public static void main(String[] args) {
        student obj = new kiitian();
        obj.getinput();
        obj.course();
        System.out.println(obj.roll);
        System.out.println(obj.regno);


    }
}
