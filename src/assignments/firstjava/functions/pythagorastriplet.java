package assignments.firstjava.functions;

import java.util.Scanner;

public class pythagorastriplet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(py(a,b,c));
    }
    static boolean py(int a , int b , int c){

        if(a*a==(b*b)+(c*c) || (b*b)==(c*c)+(a*a) || (c*c)==(a*a)+(b*b)){
            return true;
        }
        else return false;


    }
}
