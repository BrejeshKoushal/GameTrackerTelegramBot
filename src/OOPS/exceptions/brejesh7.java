package OOPS.exceptions;

import java.util.Scanner;

class negativenumberexception extends Exception{
    negativenumberexception(String message){
        super(message);
    }
}
public class brejesh7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        try {
            ProcessInput(num);
        }
        catch (negativenumberexception e){
            System.out.println(e.getMessage());
        }
    }

        public static void ProcessInput ( int num) throws negativenumberexception {
            if (num < 0) {
                throw new negativenumberexception("Only positive number please");
            } else {
                double doublenum = num * 2.0;
                System.out.println(doublenum);
            }
        }
    }

