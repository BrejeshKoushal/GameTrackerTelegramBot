package linearsearch;

import java.util.Arrays;
import java.util.Scanner;

public class forstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the word : ");
        String name = scanner.nextLine();
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.print("Enter the alphabet you want to check if is Present in the word : ");
        char alphabet = scanner.next().charAt(0);
        charsearch(name , alphabet);

    }
    static int charsearch(String str , char target){
        if(str.isEmpty()){
            System.out.println("Please enter a valid String type word.");
        }
        for(char ch : str.toCharArray()){
            if(target == ch){
                System.out.println(STR."The word '\{target} is present in the given array.'");
            }
        }
        return -1;

    }
}
