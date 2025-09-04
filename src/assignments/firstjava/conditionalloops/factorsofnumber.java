package assignments.firstjava.conditionalloops;

import java.util.Scanner;

public class factorsofnumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = scanner.nextInt();
        int ans = factor(num);
        System.out.println(ans);
    }
    static int factor(int num){
        int count  = 0 ;
        for(int i = 1 ; i<= num ;i++){
            if(num%i==0){
                count++;
            }
        }
        return count;
    }


}
