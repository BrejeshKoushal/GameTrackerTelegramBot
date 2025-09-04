package Recursion;

public class FindKthBitInNthBinaryString {
    public void main(String[] args) {
        System.out.println(findKthBit(4,11));
    }
        public char findKthBit(int n, int k) {
            String temp = recursion(n,"0");
            if(k>temp.length()) return temp.charAt(temp.length()-1);
            return temp.charAt(k-1);
        }
        public String recursion(int n,String s){

            if(n==1){
                return "0";
            }
            String ans = recursion(n-1,s);
            return s+"1"+reverseInvert(ans);

        }
            static String reverseInvert(String s) {
                StringBuilder sb = new StringBuilder();
                for (char c : s.toCharArray()) {
                    if (c == '0')
                        sb.append('1');
                    else
                        sb.append('0');
                }
                return sb.reverse().toString();
            }
}
