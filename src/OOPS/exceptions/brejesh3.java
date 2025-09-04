package OOPS.exceptions;

import java.util.Scanner;

class NegativeNumberException extends Exception{
    public NegativeNumberException(String string){
        super(string);
    }
}

public class brejesh3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        try {
            ProcessInput(number);
        }
        catch (NegativeNumberException e){
            System.out.println(e.getMessage());
        }
    }
    public static void ProcessInput(int num) throws NegativeNumberException{
        if(num<0){
            throw new NegativeNumberException("number should be positive");
        }
        else{
            double doubleval = num*2.0;
            System.out.println(doubleval);
        }
    }
}
