package assignments.firstjava;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        int num1 = scanner.nextInt();
        System.out.print("Enter number 2 : ");
        int num2 = scanner.nextInt();
        if(isArmstrong(num1)){
            System.out.println(STR."\{num1} is an Armstrong number");
        }
        else{
            System.out.println(STR."\{num1} is not an Armstrong number");
        }

        if(isArmstrong(num2)){
            System.out.println(STR."\{num2} is an Armstrong number");
        }
        else{
            System.out.println(STR."\{num2} is not an Armstrong number");
        }



    }
    static boolean isArmstrong(int num){
        int ans = 0;
        int temp = num;
        while(temp>0){
            int rem = temp%10;
            ans = ans + rem*rem*rem;
            temp/=10;

        }
        return ans == num;
    }
}
