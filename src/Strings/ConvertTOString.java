package Strings;

public class ConvertTOString {
    public static void main(String[] args) {

    }

    public int myAtoi(String s) {
        s = s.trim();
        if (s.isEmpty()) return 0;
        long num = 0;
        boolean neg = false;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(i == 0) {
                if(ch == '-') {
                    neg = true;
                    continue;

                }else if(ch == '+') {
                    neg = false;
                    continue;
                }
            }

            if (ch >= '0' && ch <= '9') {
                int digit = ch - '0';
                num = num * 10 + digit;
                if (neg) {
                    long nega = -num;
                    if (nega < Integer.MIN_VALUE) {
                        return Integer.MIN_VALUE;
                    }
                } else {
                    if (num > Integer.MAX_VALUE) return Integer.MAX_VALUE;
                }
            }
            else break;
        }
        if (neg){
            num = -1*(num);
        }
        return (int)num;
    }
}