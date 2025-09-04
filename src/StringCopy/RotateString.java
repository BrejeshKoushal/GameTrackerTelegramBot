package StringCopy;

import java.util.Arrays;

public class RotateString {
    public void main(String[] args) {
        String s ="abcde";
        String goal ="cdeab";
        System.out.println(rotateString(s,goal));
    }

    public boolean rotateString(String s, String goal) {
        for(int i =  0 ; i<s.length();i++){
            String temp = s.substring(i,s.length())+s.substring(0,i);
            if(temp.equals(goal)){
                return true;
            }
        }
        return false;
    }
}
