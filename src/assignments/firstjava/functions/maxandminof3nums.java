package assignments.firstjava.functions;

import java.util.Arrays;
import java.util.Scanner;

public class maxandminof3nums {
//    Problem: Write a Program to find the Maximum and Minimum of the Given Three Numbers.
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int a = scanner.nextInt();
int b = scanner.nextInt();
int c = scanner.nextInt();
    System.out.println(largest(a,b,c));
    System.out.println(smallest(a,b,c));
}
static int largest(int a , int b ,int c){

    int max = a;
    if(b>a){
        max = b;
    }
    if(c>a){
        max = c;
    }
return max;
}

static int smallest(int a , int b ,int c){
    int min = a;
    if(b<a){
        min = b;
    }
    if(c<a){
        min = c;
    }
    return min;



}

}
