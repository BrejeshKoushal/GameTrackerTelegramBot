package assignments.firstjava.Striver;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int nu = scanner.nextInt();
        System.out.println(fibbonacci(nu));
    }


    static int fibbonacci(int num){

        int f1 = 0 ;
        int f2 = 1;
        int f3 = f1+f2;
        for(int i = 2 ;i < num ;i++){
            f1=f2;
            f2=f3;
            f3=f1+f2;

        }
        return f3;

    }

}
