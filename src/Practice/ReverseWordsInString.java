package Practice;

import java.util.Arrays;

public class ReverseWordsInString {
    public static String reverseWords(String s) {
        String[] st = s.trim().split("\\s+");
        int n = st.length;
        int i = 0;
        int j = n-1;
        String ans = "";
        while(i<j){
            String temp = st[i];
            st[i]=st[j];
            st[j]=temp;
            i++;
            j--;
        }
        ans = String.join(" ",st);
        return ans;

    }
    public static void main(String[] args) {
        String s = " the sky     is blue ";
        System.out.println(reverseWords(s));
    }
}
