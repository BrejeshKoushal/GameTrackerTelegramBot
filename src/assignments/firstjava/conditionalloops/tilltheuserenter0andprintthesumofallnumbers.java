package assignments.firstjava.conditionalloops;

import java.util.Scanner;

public class tilltheuserenter0andprintthesumofallnumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);;
        System.out.println(sum());
        System.out.println(largest());
    }
    static int sum(){
        Scanner scanner = new Scanner(System.in);
        int sums = 0;
        int num = 1;
        while(num!=0){
            num = scanner.nextInt();
            sums+=num;
        }
        return sums;
    }

    static int largest(){
        Scanner scanner = new Scanner(System.in);
        int sums = 0;
        int num = 1;
        int largest = Integer.MIN_VALUE;
        while(num!=0){
            num = scanner.nextInt();
            if(num>largest){
                largest = num;
            }
        }
        return largest;




    }
}
