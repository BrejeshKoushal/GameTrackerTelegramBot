package OOPS.paperpractice;

import java.util.Scanner;

public class String2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.next();
        if(valid(password)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
    public static boolean valid(String str) {
        if(str.length()<5){
            return false;
        }
        int count = 0 ;
            for(int i = 0 ; i<str.length();i++){
                if(Character.isDigit(str.charAt(i))){
                    count++;
                }
            }
            return count>=3 && str.matches("[a-z0-9]+");
    }
}
