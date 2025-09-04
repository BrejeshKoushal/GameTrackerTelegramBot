package assignments.firstjava.Striver;

import java.util.Scanner;

public class sumofevenandodd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.print(sumofeven(num));
        System.out.print(" ");
        System.out.print(sumofodd(num));
    }
    static int sumofeven(int num){
        int sumeven=0;
        int rem = 0;
        while(num>0) {
            rem = num%10;
            num/=10;
            if (isEven(rem)) {
                sumeven+=rem;
            }
        }
        return sumeven;
    }
static int sumofodd(int num){
    int sumeven=0;
    int rem = 0;
    while(num>0) {
        rem = num%10;
        num/=10;
        if (!isEven(rem)) {
            sumeven+=rem;
        }
    }
    return sumeven;
}


    static boolean isEven(int num){
        return num % 2 == 0;
    }

}
