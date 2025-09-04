package assignments.firstjava;

import java.util.Scanner;

public class palindrome {
//    To find out whether the given String is Palindrome or not.
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the string : ");
    String word = scanner.nextLine();
    System.out.println(pal(word));
}
static boolean pal(String str){
    if(str.isEmpty() || str.length() == 1){
        return true;

   }
    if (str.charAt(0)!= str.charAt(str.length()-1)){
        return false;
    }
    return pal(str.substring(1,str.length()-1));

}


}
