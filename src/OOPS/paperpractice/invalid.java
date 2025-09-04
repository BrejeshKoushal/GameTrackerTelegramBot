package OOPS.paperpractice;

import java.util.Scanner;

class Invalid_age extends Exception{
    Invalid_age(String string){
        super(string);
    }
}
public class invalid {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        try{
            checkage(age);
        }
        catch(Invalid_age e){
            System.out.println(e.getMessage());
        }
    }
    static void checkage(int age) throws Invalid_age{
        if(age>100||age<0){
            throw  new Invalid_age("error");
        }
        else{
            System.out.println("valid");
        }
    }
}
