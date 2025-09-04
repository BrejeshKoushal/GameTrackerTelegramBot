package DynamicProgramming;

public class DecodeWays {
    public static int helper(String s , int m) {
        if (m == s.length()) return 1;
        if (s.charAt(m) == '0') return 0;
        int ans = 0;
        ans += helper(s, m + 1);
        if (m < s.length() - 1) {
            int two = Integer.parseInt(s.substring(m, m + 2));
            if (two >= 10 && two <= 26) {
                ans += helper(s, m + 2);
            }

        }
        return ans;
    }
    public static int numDecodings(String s) {
        return helper(s,0);
    }
    public static void main(String[] args) {
        String st = "11106";
        System.out.println(numDecodings(st));
    }
}
