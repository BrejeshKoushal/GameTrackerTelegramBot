package StringCopy;

public class StringToInteger {
    public void main(String[] args) {
        String st =  " -042";
        System.out.println(myAtoi(st));
    }
    public int myAtoi(String s) {
        s = s.trim();
        long ans = 0;
        boolean neg = false;
        for(int i = 0;i<s.length();i++){
            if(i==0){
                if(s.charAt(i)=='-') {
                    neg = true;
                    continue;
                }
            else if(s.charAt(i)=='+'){
                neg = false;
                continue;
                }
            }
            if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
                int digit = s.charAt(i)-'0';
                ans=ans * 10 + digit;
                if(neg){
                    if(-ans < Integer.MIN_VALUE) return Integer.MIN_VALUE;
                }
                else {
                    if(ans>Integer.MAX_VALUE) return Integer.MAX_VALUE;
                }
            }
            else break;

        } if (neg){
            ans = -1*(ans);
        }

return (int) ans;

    }
}
