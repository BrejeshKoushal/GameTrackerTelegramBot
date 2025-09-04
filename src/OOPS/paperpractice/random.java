package OOPS.paperpractice;

import java.util.Scanner;

class NegativeNumberException extends Exception{
    NegativeNumberException(String string){
        super(string);
    }
}
public class random {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num = scanner.nextInt();
        try{
            ProcessInput(num);
        }
        catch(NegativeNumberException e){
            System.out.println(e.getMessage());
        }

    }
    public static void ProcessInput(double num) throws NegativeNumberException{
        if(num<0){
            throw new NegativeNumberException("Number should be positive");
        }
        else{
            System.out.println(num*2);
        }
    }
}
