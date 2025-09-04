package Strings;

import java.util.Arrays;

public class Shuffle {
    public void main(String[] args) {
        String s="codeleet";
        int[]arr = {4,5,6,7,0,2,1,3};
        System.out.println(restoreString(s,arr));
    }
    public String restoreString(String s, int[] indices) {
        char[] ans = new char[s.length()];
        for (int i = 0 ; i<indices.length;i++){
            ans[indices[i]]=s.charAt(i);
        }
        return new String(ans);
    }

}
