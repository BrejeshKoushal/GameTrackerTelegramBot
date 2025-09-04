package assignments.firstjava.functions;

import java.util.Scanner;

public class oddeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        oddeven(a);
    }

    static void oddeven(int num){
        if(num%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
}
