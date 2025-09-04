package assignments.firstjava;

import java.util.Scanner;

public class charactercase {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            char letter = scanner.next().charAt(0);
            if(letter >= 'a' && letter <='z'){
                System.out.println("0");
            }
            else if (letter >= 'A' && letter <='Z'){
                System.out.println("1");
            }
            else{
                System.out.println("-1");
            }




    }
}
