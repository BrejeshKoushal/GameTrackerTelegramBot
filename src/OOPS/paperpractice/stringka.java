package OOPS.paperpractice;

import java.util.Scanner;

public class stringka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char ch = scanner.next().charAt(0);
        int count = 0;
        for(int i = 0 ; i < str.length() ;i++){
            if(str.charAt(i)==ch)
                count++;
            }
        System.out.println(count);
        StringBuilder st = new StringBuilder(str);
        if(str.contentEquals(st.reverse())){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not");
        }

    }}
