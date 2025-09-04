package Strings;

import java.util.Arrays;

public class ReverseWordsInAString {
    public void main(String[] args) {
        String str = "  hello world  ";
        System.out.println((reverseWords(str)));
    }
//    public void swap(String[] str , )
    public String reverseWords(String s) {
        String st = s.trim();
        String[] str = st.split("\\s+");
        String ans = "";
        int i = 0;
        int j = str.length-1;
        while(i<=j){
            String temp = str[i];
            str[i] = str[j];
            str[j]=temp;
            i++;
            j--;
        }
        ans = String.join(" ",str);
        return ans;
    }
}
