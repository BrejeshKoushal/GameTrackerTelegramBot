package Recursion;

public class StringToInteger {
    public void main(String[] args) {
        String s = " -42";
        System.out.println(myAtoi(s));
    }

    public int myAtoi(String s) {
        s = s.trim();
        if (s.isEmpty()) return 0;
        return recurse(s, 0, 1,0);
    }

    public int recurse(String s, int index, int sign, long result) {
        if (index == s.length()) return (int) (sign * result);
        char c = s.charAt(index);
        if (Character.isDigit(c)) {
            int digit = c - '0';
            result = (result * 10 )+ digit;
            if (sign * result < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            if (sign * result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            return recurse(s, index + 1,sign,result);
        }
      else if (index == 0&&(c=='-'||c=='+')) {
            if (c == '-') {
                sign = -1;
            }
            return recurse(s,index+1,sign,result);
        }
        return (int)(sign*result);
    }
}
