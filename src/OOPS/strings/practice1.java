package OOPS.strings;

import java.util.Scanner;

public class practice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(STR."Entered input is \{input}");
        System.out.println(STR."In upper case : \{input.toUpperCase()}");
        System.out.println(STR."In lower case : \{input.toLowerCase()}");
        StringBuilder rev = new StringBuilder(input);
        System.out.println(STR."Rversed string is \{rev.reverse()}");
        System.out.println("Enter a second string for comparison");
        String input2 = scanner.next();
        System.out.println(STR."The differnce between their ascii values is \{calculateAsciiValues(input , input2)}");
        StringBuilder ins = new StringBuilder(input);
        System.out.println("Enter the string to be appended");
        String input3 = scanner.next();
        System.out.println(STR."\{ins.append(" ").append(input3)}");
        System.out.println("Enter the character whose position you want to check");
        char ch = scanner.next().charAt(0);
        int index = input.indexOf(ch);
        if(index!=-1){
            System.out.println(STR."Index of \{ch} is \{index}");
        }
        else{
            System.out.println(STR."Character \{ch} is not present in the array");
        }
        if(checkPalindrome(input)) {
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
        wvc(input);

    }
    public static int calculateAsciiValues(String a , String b){
        int sum1 = 0;
        int sum2 = 0;

        for(int i = 0 ; i < a.length() ;i++){
            sum1+= a.charAt(i);
        }
        for(int i = 0 ; i < b.length() ;i++){
            sum2+= b.charAt(i);
        }
        return Math.abs(sum1 - sum2);
    }
    public static boolean checkPalindrome(String str){
        StringBuilder string = new StringBuilder(str);
        String b = String.valueOf(string.reverse());
        return str.equals(b);
    }
    public static void wvc(String str){

        int vowelcount=0;
        int consonantcount=0;
        int wordcount=0;
        str = str.trim().toLowerCase();
        for(char ch : str.toCharArray()){
            if(ch >= 'a' && ch <= 'z'){
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
                    vowelcount++;
                }
                else consonantcount++;
            }
        }
        String [] words = str.split(" ");
        wordcount = words.length;
        System.out.println(STR."Vowel count is \{vowelcount}");
        System.out.println(STR."Consonant count is \{consonantcount}");
        System.out.println(STR."Word count is \{wordcount}");

    }
}
