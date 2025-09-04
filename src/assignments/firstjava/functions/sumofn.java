package assignments.firstjava.functions;

import java.util.Scanner;

public class sumofn {
    public static void main(String[] args) {
        System.out.println(sum());
    }
    static int sum(){
        int sum = 0;
        int num = 1;
        Scanner scanner = new Scanner(System.in);
        while(num!=0){
            num = scanner.nextInt();
            sum+=num;
        }
        return sum;
    }
}
