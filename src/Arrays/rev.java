package Arrays;

public class rev {
    public static void main(String[] args) {
        System.out.println(isPalindrome(111
        ));
    }
    public  static boolean isPalindrome(int x) {
        int y = reversal(x);
        return x == y;
    }
    public static int reversal(int x) {

        int rem;
        int output = 0;
        while(x!=0){

            rem=  (x%10);
            output = (output*10)+rem;
            x=x/10;
        }
        return output;

    }
}
