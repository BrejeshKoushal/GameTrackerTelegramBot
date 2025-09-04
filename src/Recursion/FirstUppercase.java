package Recursion;

public class FirstUppercase {
    public void main(String[] args) {
        String str = "geeksforGeeKS";
        System.out.println(first(str,0));
    }
    char first(String str, int i)
    {
        char ch = str.charAt(i);
        if(Character.isUpperCase(ch)){
            return ch;
        }
      return first(str,i+1);
    }
}
