package Strings;

import java.util.*;

public class longestPalindromeByConcatenatingTwoWords {
    public int longestPalindrome(String[] words) {
        int res = 0;
       int[][]arr = new int[26][26];
        for(String word : words){
            int a = word.charAt(0)-'0';
            int b  = word.charAt(1)-'0';
            if(arr[b][a]>0){
                res+=4; 
                arr[b][a]--;
            }
            else arr[a][b]++;
        }
        for(int i = 0 ; i < 26;i++){
            if(arr[i][i]>0) res+=2;
        }
        return res;
    }
    public boolean isPal(String st){
        int i = 0;
        int j = st.length()-1;
        while(i<j){
           if(st.charAt(i)!=st.charAt(j)){
               return false;
           }
           i++;
           j--;
        }
        return true;
    }

    public void main(String[] args) {
        String[] st = {"ab","ty","yt","lc","cl","ab"};
        System.out.println(longestPalindrome(st));

    }
}
