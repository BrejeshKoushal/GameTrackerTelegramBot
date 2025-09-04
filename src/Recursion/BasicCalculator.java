package Recursion;

public class BasicCalculator {
    public void main(String[] args) {
        System.out.println(calculate("1+(2-3)+4"));
    }
    public int calculate(String s) {
        return helper(s,0,0);
    }
    public int helper(String s,int index , int ans){
        s=s.trim();
        int sign = 1;
        int digit = 0;
        if(index==s.length()){
            return ans;
        }
        for(int i = index ; i <s.length();i++){
            char ch = s.charAt(i);
            if(ch>='0'&&ch<='9'){
                digit = digit*10+ch-'0';
            }
            else if(ch=='('){
                helper(s,i+1,ans);
            }
            else if(ch==')') return ans+(sign*digit);
            else if(ch=='-'||ch=='+'){
                ans+=sign*digit;
                digit=0;
                sign = ch=='-'?-1:1;
            }
            

        }
        return ans+sign*digit;

    }
}
