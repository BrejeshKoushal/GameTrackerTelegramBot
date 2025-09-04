package Functions;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to check if its Armstrong number or not : ");
        int num = scanner.nextInt();
        if(isArmstrong(num)){
            System.out.println(STR."\{num} is an Armstrong number");
        }
        else{
            System.out.println(STR."\{num} is not an Armstrong number");
        }
        System.out.println("However , here I have listed all the 3 digit Armstrong numbers");
        for(int i = 100 ; i < 1000 ; i++){
            if(isArmstrong(i)){
                System.out.print(STR."\{i} ");
            }
        }

    }
    static boolean isArmstrong(int x){
        int sum = 0;
        int Original = x;
        while(x>0){

            int rem = x%10;
            sum += rem*rem*rem;
            x/=10;

        }
        return sum == Original;



    }
}
