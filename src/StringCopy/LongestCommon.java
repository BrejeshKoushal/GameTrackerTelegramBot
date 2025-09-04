package StringCopy;

import java.util.Arrays;

public class LongestCommon {
    public  void main(String[] args) {
        String[] str = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(str));
    }

    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        char[] ch1 = strs[0].toCharArray();
        char[] ch2 = strs[strs.length-1].toCharArray();
        StringBuilder ans = new StringBuilder();
        for(int i = 0;i<ch1.length;i++){
            if(ch1[i]!=ch2[i]){
                break;}
                else{
                ans.append(ch1[i]);

            }
        }
        return ans.toString();
    }
}