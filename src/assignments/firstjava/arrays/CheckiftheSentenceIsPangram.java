package assignments.firstjava.arrays;

import java.util.Scanner;

public class CheckiftheSentenceIsPangram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(pangram(name));
    }

   static boolean pangram(String str){

           char ch = 'a';

           for(int i = 0 ; i < 26 ; i++){
               if(str.contains(String.valueOf(ch))) ch++;
               else return false;
           }
           return true;


   }



}
