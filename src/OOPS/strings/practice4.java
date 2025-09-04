package OOPS.strings;

import java.util.Arrays;
import java.util.Scanner;

public class practice4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = new String[5];
        for(int i = 0 ; i < 5 ; i++){
            str[i] = scanner.nextLine();
        }
            System.out.println(Arrays.toString(str));
       for(int i = 0 ; i < 5 ;i++){
           String name = str[i];

           if(name.charAt(0)=='s'||name.charAt(0)=='S' ){
               name = name.replace('e','a');
           }
           System.out.println(name.substring(2));
       }

    }
}
