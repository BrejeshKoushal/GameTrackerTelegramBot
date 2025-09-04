package OOPS.exceptions;

import java.util.Scanner;

class negativenumexception extends Exception{
    negativenumexception(String string){
        super(string);
    }
}



public class negnumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        try{
            process(num);
        }
        catch(negativenumexception e){
            System.out.println(e.getMessage());
        }
    }
    public static void process(int num) throws negativenumexception{
        if(num<0){
            throw new negativenumexception("Number should be positive");
        }
        else{
            double doub = num*2;
            System.out.println(doub);
        }
    }
}
