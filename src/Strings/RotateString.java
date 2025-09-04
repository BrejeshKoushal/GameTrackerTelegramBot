package Strings;

public class RotateString {
    public static void main(String[] args) {

    }
    public boolean rotateString(String s, String goal) {
        for(int i = 0 ; i<s.length();i++){
            String temp = s.substring(i,s.length())+s.substring(0,i);
            if(temp.equals(goal)){
                return true;
            }
        }
        return false;
    }
}
