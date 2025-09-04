package StringCopy;

import java.util.Arrays;

public class reverse {
    public void main(String[] args) {
        String s ="a good example";
        System.out.println(reverseWords(s));
    }
    String  reverseWords(String s){
        String str = s.trim().replaceAll("\\s+"," ");
        System.out.println(str);
        String[] st = str.split(" ");
        int i = 0;
        int j = st.length-1;
        while(i<=j){
            String temp = st[i];
            st[i] = st[j];
            st[j] = temp;
            i++;
            j--;
        }
        String ans = String.join(" ",st);

        return ans;
    }
}
