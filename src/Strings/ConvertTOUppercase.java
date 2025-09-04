package Strings;

import java.util.Arrays;

public class ConvertTOUppercase {
    public static void main(String[] args) {
        String str = """
                I love programming
                they are playing cricket
                good to see you""";
        System.out.println(convert(str));
    }
    public static String convert(String str){
        String[] st = str.split(" ");
        String ans = "";
        for(int i = 0 ; i<st.length;i++){
            char ch = st[i].charAt(0);
            String upper = String.valueOf(ch).toUpperCase();
            ans+= upper + st[i].substring(1) +" ";
        }
        return ans;
    }
}
