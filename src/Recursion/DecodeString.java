package Recursion;

import java.nio.channels.ClosedChannelException;

public class DecodeString {
    public void main(String[] args) {
        String st = "3[a2[c]]";
        System.out.println(decodeString(st));
    }
    int i =0;
    public String decodeString(String s){
        StringBuilder sb = new StringBuilder();
        int number = 0;
        while(i<s.length()){
            char ch = s.charAt(i);
            i++;
            if(Character.isDigit(ch)){
                number = number*10+(ch-'0');
            }
            if(Character.isAlphabetic(ch)){
                sb.append(ch);
                continue;
            }
            if(ch=='['){
                String temp = decodeString(s);
                sb.append(temp.repeat(number));
                number = 0;
            }
            if(ch==']'){
                break;
            }
        }
        return sb.toString();
    }
}
