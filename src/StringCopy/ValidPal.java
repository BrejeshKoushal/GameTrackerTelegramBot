package StringCopy;

public class ValidPal {
    public void main(String[] args) {
        String s = "0P";
        System.out.println(isPalindrome(s));
    }
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z0-9]","");
        if(s.length()==1) return true;
        System.out.println(s);
        int i = 0;
        int j = s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
