package Practice;

import java.util.ArrayList;
import java.util.List;

public class GenerateParen {
        public void helper(List<String> list , int openC, int closeC , int n  , StringBuilder st){
            if(openC == n && openC==closeC){
                list.add(st.toString());
                return;
            }
            if(openC < n){
                st.append("(");
                helper(list, openC + 1 ,closeC, n , st);
                st.deleteCharAt(st.length()-1);
            }
            if(closeC < openC){
                st.append(")");
                helper(list, openC  ,closeC+1 ,n , st);
                st.deleteCharAt(st.length()-1);
            }
        }
        public List<String> generateParenthesis(int n) {
            List<String> lsit = new ArrayList<>();
            helper(lsit , 0 , 0,n , new StringBuilder());
            return lsit;
        }

    public void main(String[] args) {
        int n = 2;
        System.out.println(generateParenthesis(n));
    }
}
